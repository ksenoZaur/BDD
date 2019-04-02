package com.ksenoZaur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private ComboBox<?> comboBoxPattern;

    @FXML
    private ComboBox<?> comboBoxLanguages;

    @FXML
    private TextArea codeViewer;

    @FXML
    private Button generateCode;

    @FXML
    private Button showImage;

    @FXML
    private Button save;

    @FXML
    void comboBoxChange(ActionEvent event) {

    }

    @FXML
    void createWindow(ActionEvent event) {

    }

    @FXML
    void generateButtonAction(ActionEvent event) {

    }

    @FXML
    void saveText(ActionEvent event) {

    }

    @FXML
    void initialize() {
        System.out.println("Hello, world!");

    }

}

