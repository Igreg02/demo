package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Mappa {
    public static char[][] tabella = new char[3][3];

    public Mappa() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabella[i][j] = 'L';
            }
        }
    }

    @FXML
    void premuto1(ActionEvent event) {
        System.out.println("è stato premuto il bottone 1");
        tabella[0][0] = 'X';
    }

    @FXML
    void premuto2(ActionEvent event) {
        System.out.println("è stato premuto il bottone 2");
        tabella[0][1] = 'X';
    }

    @FXML
    void premuto3(ActionEvent event) {
        System.out.println("è stato premuto il bottone 3");
        tabella[0][2] = 'X';
    }

    @FXML
    void premuto4(ActionEvent event) {
        System.out.println("è stato premuto il bottone 4");
        tabella[1][0] = 'X';
    }

    @FXML
    void premuto5(ActionEvent event) {
        System.out.println("è stato premuto il bottone 5");
        tabella[1][1] = 'X';
    }

    @FXML
    void premuto6(ActionEvent event) {
        System.out.println("è stato premuto il bottone 6");
        tabella[1][2] = 'X';
    }

    @FXML
    void premuto7(ActionEvent event) {
        System.out.println("è stato premuto il bottone 7");
        tabella[2][0] = 'X';
    }

    @FXML
    void premuto8(ActionEvent event) {
        System.out.println("è stato premuto il bottone 8");
        tabella[2][1] = 'X';
    }

    @FXML
    void premuto9(ActionEvent event) {
        System.out.println("è stato premuto il bottone 9");
        tabella[2][2] = 'X';
    }
}
