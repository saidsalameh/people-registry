package com.registryapp.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("People Registry");

        var root = new StackPane(new Label("People Registry - JavaFX OK"));
        stage.setScene(new Scene(root, 400, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
