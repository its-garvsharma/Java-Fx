package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main8ExtractAndValiadte extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    Scene scene;
    Button button;

    @Override
    public void start(Stage stage) throws Exception{
        window=stage;
        window.setTitle("Java FX Application!!");

        //Form
        TextField nameInput=new TextField();

        button=new Button("CLick me");
//        button.setOnAction(e-> System.out.println(nameInput.getText()));
        button.setOnAction(e-> isInt(nameInput,nameInput.getText()));
        //layout
        VBox layout=new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput,button);
        scene=new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
    private boolean isInt(TextField input,String message){
        try{
            int age=Integer.parseInt(input.getText());
            System.out.println("User is : "+age);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Error: "+message+" is not a number");
            return false;
        }
    }
}
