package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class newFMXL extends Application {


    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Group root=new Group();
        Scene scene=new Scene(root, 600,600,Color.SKYBLUE);
//        Image icon=new Image("abc.png");
//        stage.getIcons().add(icon);
        stage.setTitle("Garv JavaFx Program");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        stage.setX(50);
        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You can't esacpe press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

//        Scene work
        Text text=new Text();
        text.setText("Garv......"); //set the text
        text.setX(50);  //set the location in
        // x axis
        text.setY(50);   // set the location in y axis
        text.setFont(Font.font("Verdana",50));   // set the font of the text
        text.setFill(Color.LIGHTCYAN);  // set the colour

        Line line=new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setRotate(45);
        line.setOpacity(0.5);

        Rectangle rectangle=new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.RED);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);

// To Make Triangle we need to use Polygon class
        Polygon triangle=new Polygon();
        triangle.getPoints().setAll(200.0,200.0,
                300.0,300.0,
                200.0,300.0);
        triangle.setFill(Color.YELLOW);
// To Make Circle we need to use Circle  class
        Circle circle=new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);
// to Add Image in the screen
//        Image image=new Image("abc.png");
//        ImageView imageView=new ImageView(image);
//        imageView.setX(400);
//        imageView.setY(400);
        root.getChildren().add(text);  // set the text on the screen
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);

//        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();

//        Group root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//        Parent root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//        stage.setTitle("hello Garv");
//        stage.setScene(new Scene(root,300,275));
//        stage.show();
    }
}