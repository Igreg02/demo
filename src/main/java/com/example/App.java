    package com.example;

    import javafx.application.Application;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.stage.Stage;
    import java.io.IOException;


    public class App extends Application {
        private static Scene scene;
        @Override
        public void start(Stage stage) throws IOException {

            scene = new Scene(loadFXML("Menu_connessione"), 600, 400);
            stage.setScene(scene);
            stage.show();

        //    scene = new Scene(loadFXML("wee"), 400, 400);
        //    stage.setScene(scene);
        //    stage.show();
        }

        static void setRoot(String fxml) throws IOException {
            scene.setRoot(loadFXML(fxml));
        }

        private static Parent loadFXML(String fxml) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
            return fxmlLoader.load();
        }


        public static void main(String[] args) {
            launch();
            //System.out.print(Mappa.tabella[0][0]);System.out.print(Mappa.tabella[0][1]);System.out.println(Mappa.tabella[0][2]);
            //System.out.print(Mappa.tabella[1][0]);System.out.print(Mappa.tabella[1][1]);System.out.println(Mappa.tabella[1][2]);
            //System.out.print(Mappa.tabella[2][0]);System.out.print(Mappa.tabella[2][1]);System.out.println(Mappa.tabella[2][2]);  
        }
    }