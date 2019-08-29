package controllers;

import App.App;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import models.Teacher;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TeacherLogin implements Initializable {

    private App app;
    @FXML
    private JFXTextField user;
    @FXML
    private JFXPasswordField password;

    private Teacher teacher;


    public TeacherLogin(Teacher teacher){
        this.teacher = teacher;
    }

    public void handleLogin(){
        teacher.setUsername(user.getText());
        teacher.setPassword(password.getText());

        ArrayList<String> teacherData = new ArrayList<>();

        try {
            teacherData = teacher.getTeacher();
        }catch (Exception e){
            e.printStackTrace();
        }

        if(teacherData.size() > 0){ //check if there is fetched teacher from database
            teacher.setFirstName(teacherData.get(0));
            teacher.setLastName(teacherData.get(1));
            try {
                app.changeSceneTo("menu");
            }catch (Exception e){
                e.printStackTrace();
            }

        } else {
            System.out.println("You are not registered!");
        }

    }

    public void handleCreate(){
        try {
            app.changeSceneTo("adminRegistration");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //TO DO
    }

    public void setAppInstance(App app){
        this.app=app;
    }
//
//    class loginListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent actionEvent) {
//            teacher.setEmployeeId("loginView.userId.getText()");
//            teacher.setPassword("loginView.password.getText()");
//
//            if(teacher.getTeacher()){
//                //go to dashboard
//            }
//
//        }
//    }

}
