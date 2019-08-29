package controllers;

import helper.QRcode;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import models.Student;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenerateQR {

    @FXML TextField firstName;
    @FXML TextField middleName;
    @FXML TextField lastName;

    private QRcode qrCode = new QRcode();
    private Student student;
    private final String Path="QRs/";

    public GenerateQR(Student student){
        this.student=student;
    }

    public void handleGenerate(){
        student.setFirstName(firstName.getText());
        student.setMiddleName(middleName.getText());
        student.setLastName(lastName.getText());

        String LRN = student.getLRNDB();
        String filePath = Path+LRN+".png";

        if(LRN != null){
            try{
                qrCode.generateQRcode(LRN, filePath);
                //show success of generating QR;
            }catch (Exception e){
                //show failure!
            }
        }
    }
//
//    class generateBtnListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent actionEvent) {
//            student.setFirstName("");
//            student.setMiddleName("");
//            student.setLastName("");
//
//            String LRN = student.getLRNDB();
//            String filePath = Path+LRN+".png";
//
//            if(LRN != null){
//                try {
//                    qrCode.generateQRcode(LRN, filePath);
//                    //show success in front
//                }catch (Exception e){
//
//                    //show failure in front
//                }
//            }
//
//
//        }
//    }
}
