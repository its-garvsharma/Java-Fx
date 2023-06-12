package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main7GridPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    @Override
    public void start(Stage stage) throws Exception{
        window=stage;
        window.setTitle("Java FX Application!!");

        GridPane grid=new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name label
        Label namelabel=new Label("UserName:");
        GridPane.setConstraints(namelabel,0,0);

        //Name input
        TextField nameInput=new TextField("Bucky");
        GridPane.setConstraints(nameInput,1,0);

        //Password label
        Label passlabel=new Label("Password:");
        GridPane.setConstraints(passlabel,0,1);

        //Password input
        TextField passInput=new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput,1,1);

        Button loginButton=new Button("Log In");
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(namelabel,nameInput,passlabel,passInput,loginButton);
        Scene scene=new Scene(grid,300,200);
        window.setScene(scene);
        window.show();
    }
}
