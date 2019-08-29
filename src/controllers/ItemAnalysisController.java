/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import App.App;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class ItemAnalysisController implements Initializable {
    private App app;
    @FXML
    private Pane main;
    @FXML
    private JFXButton back;
    @FXML
    private Label YearAndSection;
    @FXML
    private Label ModuleNo;
    @FXML
    private BorderPane table1;
    @FXML
    private Label QuizNo1;
    @FXML
    private TableView<?> ItemAnalysis1;
    @FXML
    private TableColumn<?, ?> no1;
    @FXML
    private TableColumn<?, ?> correct1;
    @FXML
    private TableColumn<?, ?> wrong1;
    @FXML
    private BorderPane table2;
    @FXML
    private Label QuizNo2;
    @FXML
    private TableView<?> ItemAnalysis2;
    @FXML
    private TableColumn<?, ?> no2;
    @FXML
    private TableColumn<?, ?> correct2;
    @FXML
    private TableColumn<?, ?> wrong2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setAppInstance(App app){
        this.app=app;
    }

    @FXML
    public void handleBack(){
        try {
            app.changeSceneTo("mindMappingMenu");
        }catch (Exception e){

        }
    }
    
}
