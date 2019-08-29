package controllers.Archive;

import models.Attendance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GetAttendanceRecord {

    private Attendance attendance;
    public GetAttendanceRecord(Attendance attendance){
        this.attendance = attendance;
    }


    class attendanceBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            attendance.setDate("view.getDate()");
            attendance.setSection("view.getSection");
            attendance.setGradeLevel("view.getGradeLevel");

            ArrayList<ArrayList<String>> attendance_record = attendance.getAttendanceRecord();
        }
    }
}
