package models;

import datasource.Database;

import java.util.ArrayList;

public class Attendance {
    private String LRN;
    private String date;
    private String gradeLevel;
    private String section;
    private String timeIn;
    private String timeOut;

    private Database database = new Database();

    public void setLRN(String LRN) {
        this.LRN = LRN;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public void recordTimeIn(){
        database.recordTimeIn(this.LRN);
    }

    public void recordTimeOut(){
        database.recordTimeOut(this.LRN);
    }

    public boolean inDB(){
        return database.getAttendance(this.LRN);
    }

    public ArrayList<ArrayList<String>> getAttendanceRecord(){
        return database.getAttendanceRecord(this.date, this.gradeLevel, this.section);
    }

//    public ArrayList<ArrayList<String>> getAttendanceOfStudent(String LRN){
//
//    }
}
