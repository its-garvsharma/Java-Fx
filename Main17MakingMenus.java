package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main17MakingMenus extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    BorderPane layout;

    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        window.setTitle("JAVA FX Application");

        //File Menu
        Menu fileMenu =new Menu("File");
        //Menu items
        MenuItem newfile=new MenuItem("New...");
        newfile.setOnAction(e-> System.out.println("Create a new file"));
        fileMenu.getItems().add(newfile);
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Setting..."));
        fileMenu.getItems().add(new MenuItem("Exit..."));

        //Edit menu
        Menu editMenu=new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));

        MenuItem paste=new MenuItem("Paste");
        paste.setOnAction(e-> System.out.println("Paste Some Crap"));
        paste.setDisable(true);
        editMenu.getItems().add(paste);

        //Help Menu
        Menu helpMenu=new Menu("Help");
        CheckMenuItem showline=new CheckMenuItem("Show Line Number");
        showline.setOnAction(e->{
            if(showline.isSelected()){
                System.out.println("Program will display Line number");
            }else {
                System.out.println("Hiding Line number");
            }
        });
        CheckMenuItem autoSave=new CheckMenuItem("Enable AutoSave");
        autoSave.setSelected(true);
        helpMenu.getItems().addAll(showline,autoSave);

        //Difficulty RadioMenuItems
        Menu difficultyMenu=new Menu("Difficulty");
        ToggleGroup difficultyToggle=new ToggleGroup();

        RadioMenuItem easy =new RadioMenuItem("Easy");
        RadioMenuItem medium =new RadioMenuItem("Medium");
        RadioMenuItem hard =new RadioMenuItem("Hard");

        easy.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        difficultyMenu.getItems().addAll(easy,medium,hard);

        //Main menu bar
        MenuBar menuBar=new MenuBar();
        menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu,difficultyMenu);

        layout=new BorderPane();
        layout.setTop(menuBar);
        Scene scene=new Scene(layout,400,300);
        window.setScene(scene);
        window.show();
    }
}

