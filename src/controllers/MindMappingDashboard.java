package controllers;

import App.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import models.Student;
import models.Teacher;

import java.net.URL;
import java.util.ResourceBundle;

public class MindMappingDashboard implements Initializable {

    private App app;
    private Student student;

    public MindMappingDashboard(Student student){
        this.student=student;
    }

    @FXML
    Label studentsNumber;

    @FXML
    public void handleReturn(){
        try {
            app.changeSceneTo("mindMappingMenu");
        }catch (Exception e){

        }
    }

    public void setAppInstance(App app){
        this.app=app;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentsNumber.setText(String.valueOf(student.getCountOfStudents()));


    }
}
