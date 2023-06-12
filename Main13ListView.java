package com.example.demo;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main13ListView extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    Button button;
    Scene scene;
    ListView<String>listView;
    @Override
    public void start(Stage stage) throws Exception{
        window=stage;
        window.setTitle("JAVA FX Application!!");
        button=new Button("SUBMIT!!");

        listView=new ListView<>();
        listView.getItems().addAll("Iron Man","Titanic","Contact","365 days","Narnia");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e-> buttonClick());


        VBox layout=new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(listView,button);
        scene=new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
    private void buttonClick(){
        String message="";
        ObservableList<String>movie;
        movie=listView.getSelectionModel().getSelectedItems();

        for(String m: movie){
            message+=m+"\n";
        }
        System.out.println(message);
    }
}
