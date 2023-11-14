package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Finestra {

    @FXML
    private Button ButtonClient;

    @FXML
    private Button ButtonServer;

    @FXML
    void SetClient(ActionEvent event) throws IOException {
        Connessione.Client();
    }

    @FXML
    void SetServer(ActionEvent event) throws IOException {
        Connessione.Server();
    }

}
