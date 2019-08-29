package models;

import  datasource.Database;
import helper.Encryption;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String middleName;
    private String lastName;
    private String LRN;
    private Integer age;
    private String section;
    private String gradeLevel;
    private String email;
    private String password;
    private String birthday;
    private String username;

    private Database source = new Database();

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setLRN(String LRN) {
        this.LRN = LRN;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName(){
        return this.firstName;
    }


    public void setPassword(String inputPassword) {

        this.password = password;
    }



    //CREATE
    public boolean addStudentToDB(){
        try {
            if(source.addStudentToDB(
                    this.firstName,
                    this.lastName,
                    this.LRN,
                    this.birthday,
                    this.section,
                    this.gradeLevel,
                    this.username,
                    this.email,
                    this.password
            )) {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Adding student to database");
        }
        return false;
    }

    //RETRIEVE

    public ArrayList<String> retrieveStudent(){
        return source.retrieveStudent(this.LRN);
    }

    public ArrayList<ArrayList<String>> retrieveAllStudents(){
        return source.retrieveAllStudents();
    }

    public String getLRNDB(){
        return source.getLRN(
                this.firstName,
                this.middleName,
                this.lastName
        );
    }

    //get count of student per gradelevel. GRADE LEVEL is input
    public int getCountOfStudentPerGradeLevel(){
        return source.numOfStudentPerGradeLevel(this.gradeLevel);
    }

    public int getCountOfStudents(){
        return source.getCountOfStudents();
    }

}
