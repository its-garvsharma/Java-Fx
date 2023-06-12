package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Button button;
    Button button2;
    @Override
    public void start(Stage stage) throws Exception{
            stage.setTitle("GARV PROGRAM");
            button=new Button();
            button2=new Button();
            button.setText("Hello!!");
//            button.setOnAction(new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(ActionEvent actionEvent) {
//                    System.out.println("Heloo world!!");
//                }
//            });
            button.setOnAction(e-> {
                System.out.println("Hey  I am Garv !!");
                System.out.println("I am you lover boy");
            });
            StackPane layout=new StackPane();
            layout.getChildren().add(button);

            Scene scene=new Scene(layout,300,250);
            stage.setScene(scene);
            stage.show();
    }

//    @Override
//    public void handle(ActionEvent event) {
//        if(event.getSource()==button){
//            System.out.println("OOO I LOVE YOU !!");
//        }
//    }

    public static void main(String[] args) {
        launch(args);
    }
}