package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FAT extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        window.setTitle("Resume");
        Label label1=new Label("Name");
        label1.setAlignment(Pos.CENTER);
        TextField nameText=new TextField();
        nameText.setAlignment(Pos.CENTER);
        Label label2=new Label("Address");
        label2.setAlignment(Pos.CENTER);
        TextField addText=new TextField();
        addText.setAlignment(Pos.CENTER);
        Label label3=new Label("Gender");
        label3.setAlignment(Pos.CENTER);
        CheckBox box1=new CheckBox("Male");
        CheckBox box2=new CheckBox("Female");
        box1.setSelected(true);
        Label label4=new Label("Qualification");
        label4.setAlignment(Pos.CENTER);
        ChoiceBox<String>qualication=new ChoiceBox<>();
        qualication.getItems().addAll("Select","High School","Intermediate","Graduate","Post Graduate","PHD");
        qualication.setValue("Select");
        Label label5=new Label("Specialization");
        label5.setAlignment(Pos.CENTER);
        ChoiceBox<String>specialtion=new ChoiceBox<>();
        specialtion.getItems().addAll("ECE","CSE","MECH","BIO-TECH","EEE");
        Button button=new Button("SUBMIT");

        VBox layout=new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(label1,nameText,label2,addText,label3,box1,box2,label4,qualication,label5,specialtion,button);
        scene=new Scene(layout,500,500);
        window.setScene(scene);
        window.show();
    }
}
