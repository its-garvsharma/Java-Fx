package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main4ComunicatingBTwindows extends Application {
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
        button.setOnAction(e->{
            boolean result =ConfirmBox.display("THE VIT_AP","Hey I am Garv from ALigarh");
            System.out.println(result);
        });
        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        Scene scene=new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
}
