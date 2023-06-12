package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main5ClosingProgramProperly extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    Button button;
    @Override
    public void start(Stage stage) throws  Exception{
        window=stage;
        window.setTitle("JavaFx - Closing Program");

        window.setOnCloseRequest(e-> {
            e.consume();
            closProgram();

        });

        button=new Button("Close Program");
        button.setOnAction(e->closProgram());
        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        Scene scene=new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    private void closProgram(){
       Boolean answer=ConfirmBox.display("APPLE Vision","Are you sure to exit ?");
       if(answer){
           window.close();
       }
    }
}

