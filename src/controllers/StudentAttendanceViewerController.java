/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import App.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jhopat Santiago
 */
public class StudentAttendanceViewerController implements Initializable {
    private App app;

    @FXML
    private TextField searchField;
    @FXML
    private ComboBox gradeLevel;
    @FXML
    private DatePicker date;
    @FXML
    private Button searchButton;
    @FXML
    private Button generateSummary;
    @FXML
    private ComboBox section;
    @FXML
    private Button goBack;
    @FXML
    private Button archiveEntries;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gradeLevel.getItems().add("7");
        gradeLevel.getItems().add("8");
        gradeLevel.getItems().add("9");
        gradeLevel.getItems().add("10");
        
        section.getItems().add("Section 1");
        section.getItems().add("Section 2");
        section.getItems().add("Section 3");
        section.getItems().add("Section 4");
        section.getItems().add("Section 5");
        section.getItems().add("E-Learning - Section 1");
        section.getItems().add("E-Learning - Section 2");
    }    

    public void setAppInstance(App app){
        this.app=app;
    }
}
