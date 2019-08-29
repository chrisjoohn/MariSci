/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import App.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Jhopat Santiago
 */
public class AttendanceHoliday implements Initializable {

    private App app;
    
    @FXML
    private DatePicker date;
    @FXML
    private ComboBox type;
    @FXML
    private TextArea description;
    @FXML
    private Button add;
    @FXML
    private Button cancel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       type.getItems().add("Holiday");
       type.getItems().add("Suspension");
       type.getItems().add("Others");
    }

    public void setAppInstance(App app) {
        this.app = app;
    }
}
