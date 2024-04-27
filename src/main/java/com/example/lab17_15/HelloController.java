package com.example.laba17_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private TextField textf;

    @FXML
    public void Button1(){
        //textf.setText("0");
        int n= Integer.parseInt(textf.getText());

        if (n<3){
            textf.setText(String.valueOf(++n));

        }
    }
    @FXML
    public void Button2(){
        //textf.setText("0");
        int n=Integer.parseInt(textf.getText());
        if(n>-5){
            textf.setText(String.valueOf(--n));
        }
    }
}