package App;

import controllers.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import views.ViewFactory;
import models.ModelFactory;

public class App extends Application {

    private ModelFactory modelFactory = new ModelFactory();

    public Stage stage;
    private ViewFactory viewFactory = new ViewFactory();

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;

        changeSceneTo("login");
        stage.setResizable(false);
        stage.show();

    }

    public void changeSceneTo(String view) throws Exception{

        FXMLLoader loader;
        Scene scene= null;
        switch (view) {

            case "AttendanceViewer":
                try{
                    loader = new FXMLLoader(viewFactory.attendanceViewer);
                    StudentAttendanceViewerController studentAttendanceViewerController = new StudentAttendanceViewerController();
                    studentAttendanceViewerController.setAppInstance(this);
                    loader.setController(studentAttendanceViewerController);
                    scene = new Scene(loader.load());

                }catch (Exception e){
                    System.out.println(e);
//                    e.printStackTrace();
                }

                break;

            case "AttendanceHoliday":
                try{
                    loader = new FXMLLoader(viewFactory.addHoliday);
                    AttendanceHoliday  attendanceHoliday = new AttendanceHoliday();
                    attendanceHoliday.setAppInstance(this);

                    loader.setController(attendanceHoliday);

                    scene = new Scene(loader.load());

                }catch (Exception e){
                    e.printStackTrace();
                }
                break;

            case "attendanceDashboard":
                try{
                    loader = new FXMLLoader(viewFactory.attendanceDashboard);
                    StudentAttendanceMenu viewerController = new StudentAttendanceMenu();
                    viewerController.setAppInstance(this);

                    loader.setController(viewerController);

                    scene = new Scene(loader.load());

                }catch (Exception e){

                }
                break;


            case "itemAnalysis":
                try{
                    loader = new FXMLLoader(viewFactory.itemAnalysis);
                    ItemAnalysisController analysisController = new ItemAnalysisController();
                    analysisController.setAppInstance(this);
                    loader.setController(analysisController);

                    scene = new Scene(loader.load());

                }catch (Exception e){

                }

                break;

            case "studentMindMapping":
                try {
                    loader = new FXMLLoader(viewFactory.studentsMindMapping);
                    StudentController studentController = new StudentController();
                    studentController.setAppInstance(this);
                    loader.setController(studentController);
                    scene = new Scene(loader.load());
                }catch (Exception e){

                }
                break;
            case "classRating":
                try {
                    loader = new FXMLLoader(viewFactory.classRating);
                    ClassRatingController ratingController = new ClassRatingController();
                    ratingController.setAppInstance(this);

                    loader.setController(ratingController);

                    scene = new Scene(loader.load());
                }catch (Exception e){

                }
                break;

            case "teacherRating":
                try{
                    loader = new FXMLLoader(viewFactory.teacherRating);
                    TeachersRatingController teachersRatingController = new TeachersRatingController();
                    teachersRatingController.setAppInstance(this);
                    loader.setController(teachersRatingController);

                    scene = new Scene(loader.load());
                }catch (Exception e){

                }
                break;

            case "mindMappingDashboard":
                try{
                    loader= new FXMLLoader(viewFactory.mindMapppingDashboard);
                    MindMappingDashboard mappingDashboard = new MindMappingDashboard(modelFactory.student);
                    mappingDashboard.setAppInstance(this);
                    loader.setController(mappingDashboard);
                    scene = new Scene(loader.load());

                }catch (Exception e){

                }

                break;

            case "mindMappingMenu":
                try {
                    loader = new FXMLLoader(viewFactory.mindMappingMenu);
                    MindMappingMenuController mmmp = new MindMappingMenuController(modelFactory.teacher);
                    mmmp.setAppInstance(this);
                    loader.setController(mmmp);
                    scene = new Scene(loader.load());
                }catch (Exception e){
                    System.out.println(e);
                }
                break;

            case "teacherItemAnalysis":
                loader = new FXMLLoader(viewFactory.teacherItemAnalysis);
                scene = new Scene(loader.load());

                break;


            case "teacherMenu":
                loader = new FXMLLoader(viewFactory.teacherMenu);

                scene = new Scene(loader.load());

                break;

            case "login":
                loader = new FXMLLoader(viewFactory.login);
                TeacherLogin teacherLogin = new TeacherLogin(modelFactory.teacher);
                teacherLogin.setAppInstance(this);
                loader.setController(teacherLogin);
                scene = new Scene(loader.load());
                break;

            case "adminRegistration":
                loader = new FXMLLoader(viewFactory.adminRegistration);
                TeacherRegistration teacherRegistration = new TeacherRegistration(modelFactory.teacher);
                teacherRegistration.setAppInstance(this);
                loader.setController(teacherRegistration);
                scene = new Scene(loader.load());
                break;

            case "menu":
                loader = new FXMLLoader(viewFactory.menu);
                MenuController menuController = new MenuController(modelFactory.teacher);
                loader.setController(menuController);
                menuController.setAppInstance(this);
                menuController.setViewFactoryInstance(this.viewFactory);
                scene = new Scene(loader.load());

                break;

            case "studentRegistration":
                loader = new FXMLLoader(viewFactory.studentRegistration);
                StudentRegistration studentRegistration = new StudentRegistration(modelFactory.student);
                studentRegistration.setAppInstance(this);
                loader.setController(studentRegistration);
                scene = new Scene(loader.load());
                break;


            case "attendanceTimeIn":
                loader = new FXMLLoader(viewFactory.studentAttendanceTimeIn);
                RecordTimeInAttendance recordTimeIn = new RecordTimeInAttendance(modelFactory.student, modelFactory.attendance);
                recordTimeIn.setAppInstance(this);
                loader.setController(recordTimeIn);
                scene = new Scene(loader.load());
                break;

            case "attendanceTimeOut":
                loader = new FXMLLoader(viewFactory.studentAttendanceTimeOut);
                RecordTimeOutAttendance recordTimeOut = new RecordTimeOutAttendance(modelFactory.student,modelFactory.attendance);
                recordTimeOut.setAppInstance(this);
                loader.setController(recordTimeOut);
                scene = new Scene(loader.load());
                break;
            }
        stage.setScene(scene);
    }

    public static void main(String[] args) {
//        System.out.println("Program running...");
        launch(args);
    }
}
