package com.example.lab17_1;

import javafx.event.ActionEvent.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.Scene;

public class HelloController {
    @FXML
    private Button calculate;

    @FXML
    private Button clear;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;

    @FXML
    public void Button1(){
        int a = Integer.parseInt(txt1.getText());
        int b = Integer.parseInt(txt2.getText());
        float sum = a+b;
        txt3.setText(String.valueOf(sum));

    }
    @FXML
    public void Button2(){
        //int a=Integer.parseInt(txt1.getText());
       // int b=Integer.parseInt(txt2.getText());
        txt1.setText(" ");
        txt2.setText(" ");
        txt3.setText(" ");
    }

}