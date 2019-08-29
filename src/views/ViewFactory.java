package views;

import java.net.URL;

public class ViewFactory {

    public URL adminRegistration = getClass().getResource("admin_registration.fxml");
    public URL menu = getClass().getResource("Menu_Panel.fxml");
    public URL studentRegistration = getClass().getResource("studentRegistration.fxml");
    public URL login = getClass().getResource("Login.fxml");
    public URL teacherMenu = getClass().getResource("TeacherMenu.fxml");
    public URL teacherItemAnalysis = getClass().getResource("TeacherItemAnalysis.fxml");
    public URL mindMappingMenu = getClass().getResource("MindMappingMenu.fxml");
    public URL mindMapppingDashboard = getClass().getResource("Dashboard.fxml");
    public URL teacherRating = getClass().getResource("TeachersRating.fxml");
    public URL classRating = getClass().getResource("ClassRating.fxml");
    public URL studentsMindMapping = getClass().getResource("Students.fxml");
    public URL itemAnalysis = getClass().getResource("ItemAnalysis.fxml");


    /**
     * Attendance
     */
    public URL attendanceDashboard = getClass().getResource("AttendanceMenu.fxml");
    public URL studentAttendanceTimeIn = getClass().getResource("studentAttendanceTimeIn.fxml");
    public URL studentAttendanceTimeOut = getClass().getResource("studentAttendanceTimeOut.fxml");
    public URL addHoliday = getClass().getResource("studentAttendanceAddHoliday.fxml");
    public URL attendanceViewer = getClass().getResource("studentAttendanceViewRecord.fxml");


}


