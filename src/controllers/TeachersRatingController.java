/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import App.App;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class TeachersRatingController implements Initializable {

    private App app;

    @FXML
    private Pane main;
    @FXML
    private ImageView bg;
    @FXML
    private JFXButton Return;
    @FXML
    private JFXComboBox<Label> GradeLevel;
    @FXML
    private JFXComboBox<?> Subject;
    @FXML
    private JFXComboBox<?> Teacher;
    @FXML
    private JFXComboBox<?> Section;
    @FXML
    private AnchorPane pane;
    @FXML

    private BorderPane TeacherEval;
    @FXML
    private Label GraphTitle;
    @FXML
    private BarChart<?, ?> barGraph;
    @FXML
    private ProgressIndicator RatingofTeacher;
    @FXML
    private Label NameOfTeacher;
    @FXML
    private Label LabelTeacherRating;
    @FXML
    private Label NoResult;
    @FXML
    private JFXButton generate;

    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        GradeLevel.getItems().add(new Label("Grade 7"));
        GradeLevel.getItems().add(new Label("Grade 8"));
        GradeLevel.getItems().add(new Label("Grade 9"));
        GradeLevel.getItems().add(new Label("Grade 10"));
    }

    public void setAppInstance(App app){
        this.app=app;
    }

    @FXML
    public void handleReturn(){
        try {
            app.changeSceneTo("mindMappingMenu");
        }catch (Exception e){

        }
    }

}
