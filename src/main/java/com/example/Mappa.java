package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Mappa {
    public static char[][] tabella = new char[3][3];
    public static int Turno_Numero = 0;
    public static boolean Finito = false;
    public static char Turno_Di = 'X';
    public static boolean Ospite = false;

    public Mappa() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabella[i][j] = 'N';
            }
        }
    }

    public void Regole() {
        if(Ospite) System.out.print("SONO UN CLIENTTTTTTT");

            if ((tabella[0][0] == Turno_Di && tabella[0][1] == Turno_Di && tabella[0][2] == Turno_Di) ||
                (tabella[1][0] == Turno_Di && tabella[1][1] == Turno_Di && tabella[1][2] == Turno_Di) || // orizontali
                (tabella[2][0] == Turno_Di && tabella[2][1] == Turno_Di && tabella[2][2] == Turno_Di) ||

                (tabella[0][0] == Turno_Di && tabella[1][0] == Turno_Di && tabella[2][0] == Turno_Di) ||
                (tabella[0][1] == Turno_Di && tabella[1][1] == Turno_Di && tabella[2][1] == Turno_Di) || // verticali
                (tabella[0][2] == Turno_Di && tabella[1][2] == Turno_Di && tabella[2][2] == Turno_Di) ||

                (tabella[0][0] == Turno_Di && tabella[1][1] == Turno_Di && tabella[2][2] == Turno_Di) || // inclinate
                (tabella[0][2] == Turno_Di && tabella[1][1] == Turno_Di && tabella[2][0] == Turno_Di))
                {
                    System.out.print("Ha vinto mr "); System.out.println(Turno_Di);
                    Finito = true;
                }



                if (Turno_Di == 'X') Turno_Di = 'O'; else Turno_Di = 'X'; //Scambio di turno



            if (Turno_Numero > 9) {System.out.println("Avete finito le mosse");} //TODO: Non poter ripremere lo stesso tasto
            Turno_Numero++;
            Bloccabottoni(true);
            Bloccabottoni(false);

    }


    private void Bloccabottoni(boolean bool)
    {
            Button1.setDisable(bool);
            Button2.setDisable(bool);
            Button3.setDisable(bool);
            Button4.setDisable(bool);
            Button5.setDisable(bool);
            Button6.setDisable(bool);
            Button7.setDisable(bool);
            Button8.setDisable(bool);
            Button9.setDisable(bool);
    }


    @FXML
    private Button Button1, Button2 ,Button3 ,Button4 ,Button5 ,Button6 ,Button7 ,Button8 ,Button9;

    @FXML
    void premuto1(ActionEvent event) {
        tabella[0][0] = Turno_Di;
        Button1.setText(Character.toString(Turno_Di));
        Regole();
    }

    @FXML
    void premuto2(ActionEvent event) {
        tabella[0][1] = Turno_Di;
        Button2.setText(Character.toString(Turno_Di));
        Regole();
    }

    @FXML
    void premuto3(ActionEvent event) {
        tabella[0][2] = Turno_Di;
        Button3.setText(Character.toString(Turno_Di));
        Regole();
    }

    @FXML
    void premuto4(ActionEvent event) {
        tabella[1][0] = Turno_Di;
        Button4.setText(Character.toString(Turno_Di));
        Regole();

    }

    @FXML
    void premuto5(ActionEvent event) {
        tabella[1][1] = Turno_Di;
        Button5.setText(Character.toString(Turno_Di));
        Regole();

    }

    @FXML
    void premuto6(ActionEvent event) {
        tabella[1][2] = Turno_Di;
        Button6.setText(Character.toString(Turno_Di));
        Regole();

    }

    @FXML
    void premuto7(ActionEvent event) {
        tabella[2][0] = Turno_Di;
        Button7.setText(Character.toString(Turno_Di));
        Regole();


    }

    @FXML
    void premuto8(ActionEvent event) {
        tabella[2][1] = Turno_Di;
        Button8.setText(Character.toString(Turno_Di));
        Regole();


    }

    @FXML
    void premuto9(ActionEvent event) {
        tabella[2][2] = Turno_Di;
        Button9.setText(Character.toString(Turno_Di));
        Regole();
    }
}