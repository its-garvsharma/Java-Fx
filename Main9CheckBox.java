package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main9CheckBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    Button button;
    Scene scene;
    @Override
    public void start(Stage stage) throws Exception{
        window=stage;
        window.setTitle("JAVA FX Application!!");

        //Check Box
        CheckBox box1=new CheckBox("Bacon");
        CheckBox box2=new CheckBox("Tuna");
        box2.setSelected(true);

        button=new Button("Order Now!!");
        button.setOnAction(e->handleOptions(box1,box2));
        VBox layout=new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(box1,box2,button);
        scene=new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
    private  void handleOptions(CheckBox box1,CheckBox box2){
        String message="Users Order:\n ";
        if(box1.isSelected()){
            message+="Bacon\n";
        }if(box2.isSelected()){
            message+="Tuna\n";
        }
        System.out.println(message);
    }
}
