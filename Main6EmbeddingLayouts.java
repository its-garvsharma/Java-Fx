package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main6EmbeddingLayouts extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    Button button;
    @Override
    public void start(Stage stage) throws  Exception{
        window=stage;
        window.setTitle("JavaFx - Closing Program");

        HBox topMenu=new HBox();
        Button buttonA=new Button("File");
        Button buttonB=new Button("Edit");
        Button buttonC=new Button("View");
        topMenu.getChildren().addAll(buttonA,buttonB,buttonC);


        VBox leftMenu=new VBox();
        Button buttonD=new Button("D");
        Button buttonE=new Button("E");
        Button buttonF=new Button("F");
        leftMenu.getChildren().addAll(buttonD,buttonE,buttonF);

        BorderPane borderPane=new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);
        Scene scene=new Scene(borderPane,300,250);
        window.setScene(scene);
        window.show();
    }
}
