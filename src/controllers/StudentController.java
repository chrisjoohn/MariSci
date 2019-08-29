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
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class StudentController implements Initializable {
    private App app;
    @FXML
    private Pane main;
    @FXML
    private ImageView bg;
    @FXML
    private JFXButton Return;
    @FXML
    private JFXComboBox GradeLevel;
    @FXML
    private JFXComboBox<?> Subject;
    @FXML
    private JFXComboBox<?> Teacher;
    @FXML
    private JFXComboBox Section;
    @FXML
    private JFXButton generate;
    @FXML
    private ScrollPane ScrollPane;
    @FXML
    private AnchorPane pane;
    @FXML
    private Label GradeLevelSection;
    @FXML
    private Label NoResult;
    @FXML
    private BorderPane table1;
    @FXML
    private Label QuizNo1;
    @FXML
    private TableView<?> scores;
    @FXML
    private TableColumn<?, ?> StudentColumn;
    @FXML
    private TableColumn<?, ?> quiz1;
    @FXML
    private TableColumn<?, ?> quiz2;
    @FXML
    private TableColumn<?, ?> quiz3;
    @FXML
    private TableColumn<?, ?> quiz4;
    @FXML
    private TableColumn<?, ?> rating;
    @FXML
    private BorderPane table2;
    @FXML
    private Label QuizNo11;
    @FXML
    private TableView<?> scores2;
    @FXML
    private TableColumn<?, ?> StudentColumn2;
    @FXML
    private TableColumn<?, ?> quiz12;
    @FXML
    private TableColumn<?, ?> quiz22;
    @FXML
    private TableColumn<?, ?> quiz32;
    @FXML
    private TableColumn<?, ?> quiz42;
    @FXML
    private TableColumn<?, ?> rating2;

    /**
     * Initializes the controller class.
     */
    ObservableList<String> gradeLevel = FXCollections.observableArrayList("Grade 7", "Grade 8", "Grade 9", "Grade 10");
    ObservableList<String> sections = FXCollections.observableArrayList("1", "2", "3");

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        GradeLevel.getItems().addAll(gradeLevel);
        GradeLevel.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                Section.getItems().addAll(sections);
            }
        });
    }

    public void setAppInstance(App app){
        this.app=app;
    }

    public void handleBack(){
        try{
            app.changeSceneTo("mindMappingMenu");
        }catch (Exception e){

        }
    }


}
