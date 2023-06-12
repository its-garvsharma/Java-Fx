package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Circle myCricle;
    private double x;
    private double y;
    public  void up(ActionEvent e){

//        System.out.println("UP");
        myCricle.setCenterY(y-=10);
    }
    public  void down(ActionEvent e){
//        System.out.println("DOWN");
        myCricle.setCenterY(y+=10);
    }
    public  void left(ActionEvent e){

//        System.out.println("LEFT");
        myCricle.setCenterX(x-=10);
    }
    public  void right(ActionEvent e){
        myCricle.setCenterX(x+=10);
//        System.out.println("RIGHT");
    }
}