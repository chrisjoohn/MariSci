package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import models.Student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;
import App.App;

public class StudentRegistration implements Initializable {

    private App app;

    @FXML TextField firstName;
    @FXML TextField lastName;
    @FXML TextField LRN;
    @FXML TextField section;
    @FXML DatePicker birthday;
    @FXML TextField gradeLevel;
    @FXML TextField email;
    @FXML PasswordField password;
    @FXML PasswordField confirm;

    private Student student;

    public StudentRegistration(Student student){
        this.student = student;
    }

    @FXML
    public void handleSubmit(){
//        if(confirm.getText().equals(password.getText())){
//            student.setFirstName(firstName.getText());
//            student.setLastName(lastName.getText());
//            student.setLRN(LRN.getText());
//            student.setSection(section.getText());
//            student.setGradeLevel(gradeLevel.getText());
//            student.setEmail(email.getText());
//            student.setPassword(password.getText());
//
//            if(student.addStudentToDB()){
//                //registration is okay
//                //what to do now?
//            }
//        }
    }

    @FXML
    public void handleCancel(){
        try {
            app.changeSceneTo("menu");
        }catch (Exception e){
            System.out.println(e);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //TO DO
    }
    public void setAppInstance(App app){
        this.app = app;
    }

//    class registerBtnListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent actionEvent) {
//            student.setFirstName("");
//            student.setMiddleName("");
//            student.setLastName("");
//            student.setLRN("");
//            student.setAge(0);
//            student.setSection("");
//            student.setGradeLevel("");
//            student.setEmail("");
//            student.setPassword("");
//
//            if(student.addStudentToDB()){
//                // registration is okay!
//            }
//        }
//    }
//
//    class cancelBtnListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent actionEvent) {
//            //cancel
//        }
//    }
}
