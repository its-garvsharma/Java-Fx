package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main12ComboBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    Button button;
    Scene scene;
    ComboBox<String>comboBox;
    @Override
    public void start(Stage stage) throws Exception{
        window=stage;
        window.setTitle("JAVA FX Application!!");
        button=new Button("Submit!!");

        comboBox=new ComboBox<>();
        comboBox.getItems().addAll("Good will hunting","St. Vincent","BlackHat");
        comboBox.setPromptText("What was your favorite movie ?");
        button.setOnAction(e-> printmove());
        comboBox.setOnAction(e-> System.out.println("User selected: "+comboBox.getValue()));

        VBox layout=new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(comboBox,button);
        scene=new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
    private void printmove(){
        System.out.println("His Favorite movie is : "+comboBox.getValue());
    }
}
