package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FAT2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;

    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        window.setTitle("Student Registration Form");
        Rectangle rectangle=new Rectangle();
        rectangle.setHeight(50);
        rectangle.setWidth(100);
        rectangle.setStrokeWidth(100);
        Label heading=new Label("Student Registration Form");
        heading.setAlignment(Pos.CENTER);
        heading.setBorder(Border.stroke(Color.BLACK));

        GridPane gridPane=new GridPane();
        gridPane.setPadding(new Insets(40,40,40,40));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        Label name=new Label("Name:");
        GridPane.setConstraints(name,0,0);

        TextField nameText=new TextField("Enter Your Full name");
        GridPane.setConstraints(nameText,1,0);

        Label phoneNumber=new Label("Phone Number");
        GridPane.setConstraints(name,0,2);

        TextField phoneText=new TextField("071xxxxxxxx");
        GridPane.setConstraints(phoneText,1,1);

        Label email=new Label("Email");
        GridPane.setConstraints(name,0,3);

        TextField emailText=new TextField("sample@example.com");
        GridPane.setConstraints(emailText,1,2);

        Label gender=new Label("Gender");
        GridPane.setConstraints(gender,0,3);

        RadioButton button1=new RadioButton("Male");
        RadioButton button2=new RadioButton("Female");
        GridPane.setConstraints(button1,1,3);
        GridPane.setConstraints(button2,2,3);

        Label address=new Label("Address:");
        GridPane.setConstraints(name,0,0);

        TextField addressText=new TextField("Street-    House-     Road-");
        GridPane.setConstraints(addressText,1,4);

        Label bloodGp=new Label("Blood Group:");
        GridPane.setConstraints(bloodGp,0,5);

        ChoiceBox<String>choiceBox=new ChoiceBox<>();
        choiceBox.getItems().addAll("Select","O+","o-","A+","A-","B+","B-");
        choiceBox.setValue("Select");
        GridPane.setConstraints(choiceBox,1,5);

        Label Department=new Label("Department:");
        GridPane.setConstraints(Department,0,6);

        RadioButton button3=new RadioButton("CSE");
        RadioButton button4=new RadioButton("ECE");
        RadioButton button5=new RadioButton("ME");
        GridPane.setConstraints(button3,1,6);
        GridPane.setConstraints(button4,2,6);
        GridPane.setConstraints(button5,3,6);

        Label course=new Label("Course:");
        GridPane.setConstraints(course,0,7);
        CheckBox checkBox1=new CheckBox("C");
        CheckBox checkBox2=new CheckBox("C++");
        CheckBox checkBox3=new CheckBox("Java");
        CheckBox checkBox4=new CheckBox("AI");
        GridPane.setConstraints(checkBox1,1,7);
        GridPane.setConstraints(checkBox2,2,7);
        GridPane.setConstraints(checkBox3,3,7);
        GridPane.setConstraints(checkBox4,4,7);

        Button submit=new Button("SUBMIT");
        GridPane.setConstraints(submit,1,8);
        Button reset=new Button("Reset");
        GridPane.setConstraints(reset,2,8);

        gridPane.getChildren().addAll(rectangle,name,nameText,phoneNumber,phoneText,email,emailText,gender,button1,button2,address,addressText,bloodGp,choiceBox, Department,
                button3,button4,button5,course,checkBox1,checkBox2,checkBox3,checkBox4,submit,reset);
        Scene scene=new Scene(gridPane,1000,1000);
        window.setScene(scene);
        window.show();



    }
}
