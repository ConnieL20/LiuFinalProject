package com.example.liufinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    private Button startButton;
    Stage stage;
    Scene scene;

    public void switchToScene(ActionEvent event) throws IOException{
        //loads window
        FXMLLoader fxmlLoader = new FXMLLoader(HomeController.class.getResource("SceneOne.fxml"));
        //load the scene/window
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

}