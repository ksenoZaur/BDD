package com.ksenoZaur;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BDD extends Application {

    public static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception{
        BDD.primaryStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/com.ksenoZaur/sample.fxml"));
        stage.setTitle("Генератор паттернов");
        Scene scene = new Scene(root, 800, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}