package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import models.Teacher;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import App.App;

import javax.swing.*;

public class TeacherRegistration implements Initializable {

    ObservableList<String> positionList = FXCollections.observableArrayList("Principal","Assistant Principal","Head Teacher","Registar","Administrative Staff","Teacher - Science Department"
            ,"Teacher - Filipino Department","Teacher - English Department","Teacher - Mathematics Department","Teacher - MAPEH Department","Teacher - ESP Department",
            "Teacher - AP Department", "Teacher - TLE Department","Facilitative Staff","Guest");

    private App app;

    @FXML private TextField firstName;
    @FXML private TextField lastName;
    @FXML private TextField employeeId;
    @FXML private ComboBox  position;
    @FXML private DatePicker birthday;
    @FXML private TextField email;
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private PasswordField confirm;
    @FXML private Label messageLabel;

    private Teacher teacher;

    public TeacherRegistration(Teacher teacher){
        this.teacher = teacher;
    }

    private void clearInputs(){
        firstName.setText("");
        lastName.setText("");
        employeeId.setText("");
        email.setText("");
        username.setText("");
        password.setText("");
        confirm.setText("");
    }

    @FXML
    public void handleSubmit(){
        if(confirm.getText().equals(password.getText())) {
                teacher.setFirstName(firstName.getText());
                teacher.setLastName(lastName.getText());
                teacher.setEmployeeId(employeeId.getText());
                teacher.setPosition((String) position.getValue());
                teacher.setBirthday(String.valueOf(birthday.getValue()));
                teacher.setUsername(username.getText());
                teacher.setEmail(email.getText());
                teacher.setPassword(password.getText());

            try {
                if (teacher.insertTeacher()) {
//                    app.changeSceneTo("login");
                    messageLabel.setText("Successfully Registered!");
                    clearInputs();
                } else {
                    messageLabel.setText("Invalid Registration!");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @FXML
    public void handleCancel(){
        try{
            app.changeSceneTo("login");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setAppInstance(App app){
        this.app = app;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        position.getItems().addAll(positionList);
    }

}
