package models;

import datasource.Database;
import datasource.CSV;

import java.util.ArrayList;

public class Record {

    private Database database = new Database();
    private CSV csv = new CSV();

    private String teacherId;
    private String subject;
    private String section;
    private String gradeLevel;
    private int quizNum;
    private String filePath;
    private int numOfCorrect;
    private int numOfWrong;
    private int totalItems;
    private int totalStudents;


    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setQuizNum(int quizNum) {
        this.quizNum = quizNum;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setNumOfCorrect(int numOfCorrect) {
        this.numOfCorrect = numOfCorrect;
    }

    public void setNumOfWrong(int numOfWrong) {
        this.numOfWrong = numOfWrong;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    //CREATE RECORD

    public boolean createRecord(){

        ArrayList<ArrayList<String>> itemAnalysis = csv.readCSV(this.filePath);
        return database.createRecord(this.teacherId,
                this.subject,
                this.section,
                this.gradeLevel,
                this.quizNum,
                itemAnalysis);
    }

//    public ArrayList<String> getRecordPerSection(){
//
//        return
//    }



}
