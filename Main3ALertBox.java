package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main3ALertBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    Button button;
    @Override
    public void start(Stage stage) throws  Exception{
        window=stage;
        window.setTitle("The new application");

        button=new Button("CLick Me");
        button.setOnAction(e->AlertBox.display("The VIT-AP","The Vitians"));
        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        Scene scene=new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
}
