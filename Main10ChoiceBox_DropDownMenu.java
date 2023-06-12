package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main10ChoiceBox_DropDownMenu extends Application {
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
        button=new Button("Order Now!!");

        ChoiceBox<String> choiceBox=new ChoiceBox<>();

        //getItems returns the observable List object which you can add items to
        choiceBox.getItems().add("Apple");
        choiceBox.getItems().add("Banana");
        choiceBox.getItems().addAll("Mango","Grapes","Guava","Strawbarry");

        choiceBox.setValue("Apple");
        button.setOnAction(e->getChoice(choiceBox));

        VBox layout=new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox,button);
        scene=new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
    private void getChoice(ChoiceBox<String>choiceBox){
        System.out.println("Order is : "+choiceBox.getValue());
    }
}
