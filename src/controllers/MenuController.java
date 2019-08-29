package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;


import App.App;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Polygon;
import models.Teacher;
import views.ViewFactory;


import java.net.URL;
import java.util.ResourceBundle;



public class MenuController implements Initializable {

    private App app;
    private ViewFactory viewFactory;
    private Teacher teacher;

    @FXML
    private ImageView bg;
    @FXML
    private JFXButton dashboard;
    @FXML
    private JFXButton attendance;
    @FXML
    private JFXButton teachers_rating;
    @FXML
    private JFXButton class_rating;
    @FXML
    private JFXButton students;
    @FXML
    private Label profile;
    @FXML
    private AnchorPane buttonDown;
    @FXML
    private Polygon dropdown_button;
    @FXML
    private AnchorPane buttonUp;
    @FXML
    private Polygon dropdown_buttonUp;
    @FXML
    private AnchorPane dropdown;
    @FXML
    private JFXButton edit_profile;
    @FXML
    private JFXButton log_out;

    public MenuController(Teacher teacher){
        this.teacher=teacher;
    }

    @FXML
    public void show(){
        dropdown.setVisible(true);
        buttonDown.setVisible(false);
        buttonUp.setVisible(true);
    }

    @FXML
    public void hide(){
        dropdown.setVisible(false);
        buttonDown.setVisible(true);
        buttonUp.setVisible(false);
    }

    public void handleMindMappingClick(){
        try {
            app.changeSceneTo("mindMappingMenu");
        }catch (Exception e){

        }
    }

    public void handleAttendanceClick(){
        try{
            app.changeSceneTo("attendanceDashboard");
        }catch (Exception e){

        }
    }

    public void handleLogout(){
        try{
            teacher.setFirstName(null);
            teacher.setLastName(null);
            app.changeSceneTo("login");
        }catch (Exception e){

        }
    }


    public void setAppInstance(App app){
        this.app=app;
    }

    public void setViewFactoryInstance(ViewFactory viewFactory){
        this.viewFactory = viewFactory;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dropdown.setVisible(false);
        buttonUp.setVisible(false);

        profile.setText(teacher.getFirstName());

//        profile.getItems().add("Edit Profile");
//        profile.getItems().add("Log Out");
    }
}
