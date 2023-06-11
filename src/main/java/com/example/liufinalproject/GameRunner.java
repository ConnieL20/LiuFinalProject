package com.example.liufinalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameRunner extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GameRunner.class.getResource("HomePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1437, 844);
        stage.setTitle("The Truth of Beauty");
        stage.setScene(scene);
        stage.show();
    }
//    }603440864

    public static void main(String[] args) {
        launch();
    }
}