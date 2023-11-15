package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Finestra {


    private Scene scene;
    private Parent root;
    private Stage stage;

    @FXML
    private Button ButtonClient,ButtonServer,ButtonGioca;

    @FXML
    private Label ShowIP;

    @FXML
    void SetServer(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("Host.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void SetClient (ActionEvent event) throws IOException {        
    root = FXMLLoader.load(getClass().getResource("Client.fxml"));
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }

    @FXML
    void Gioca(ActionEvent event) throws IOException
        {
        
        }
    }
    

