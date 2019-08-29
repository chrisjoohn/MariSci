/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Polygon;
import App.App;
import models.Teacher;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class MindMappingMenuController implements Initializable {
    private App app;
    private Teacher teacher;
//    @FXML
//    private ImageView bg;
    @FXML
    private Label profile;
//    @FXML
//    private AnchorPane buttonDown;
//    @FXML
//    private Polygon dropdown_button;
//    @FXML
//    private AnchorPane buttonUp;
//    @FXML
//    private Polygon dropdown_buttonUp;
//    @FXML
//    private AnchorPane dropdown;
//    @FXML
//    private JFXButton edit_profile;
//    @FXML
//    private JFXButton log_out;
//    @FXML
//    private JFXButton Dashboard;
//    @FXML
//    private JFXButton ClassRating;
//    @FXML
//    private JFXButton TeachersRating;
//    @FXML
//    private JFXButton Students;
//    @FXML
//    private JFXButton ItemAnalysis;
//    @FXML
//    private JFXButton back;

    public MindMappingMenuController(Teacher teacher){
        this.teacher=teacher;
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        profile.setText(teacher.getFirstName());
    }    

    @FXML
    private void show(MouseEvent event) {
    }

    @FXML
    private void hide(MouseEvent event) {
    }

    @FXML
    private void handleBack(){
        try{
            app.changeSceneTo("menu");
        }catch (Exception e){

        }
    }

    public void handleDashboardClick(){
        try{
            app.changeSceneTo("mindMappingDashboard");
        }catch (Exception e){

        }
    }

    public void handleTeacherRating(){
        try{
            app.changeSceneTo("teacherRating");
        }catch (Exception e){

        }
    }

    public void handleClassRating(){
        try {
            app.changeSceneTo("classRating");
        }catch (Exception e){

        }
    }

    public void handleStudents(){
        try{
            app.changeSceneTo("studentMindMapping");
        }catch (Exception e){

        }
    }

    public void handleItemAnalysis(){
        try{
            app.changeSceneTo("itemAnalysis");
        }catch (Exception e){

        }
    }

    public void setAppInstance(App app){
        this.app = app;
    }
    
}
