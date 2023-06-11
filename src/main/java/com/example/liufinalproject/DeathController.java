package com.example.liufinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DeathController {

    @FXML
    private Label death;

    @FXML
    private Button restart;

    private Stage stage;
    private Scene scene;

    public DeathController(){
        death = new Label();
        restart = new Button();
    }
    public void restartGame(ActionEvent e) throws IOException {
        //loads window
        FXMLLoader fxmlLoader = new FXMLLoader(HomeController.class.getResource("SceneOne.fxml"));
        //load the scene/window
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

}
