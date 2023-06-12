package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main14TreeView extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    TreeView<String> tree;

    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        window.setTitle("JAVA FX Application!!");

        TreeItem<String>root,bucky,megan;
        //Root
        root=new TreeItem<>();
        root.setExpanded(true);

        //Bunky
        bucky=makeBrunch("Bucky",root);
        makeBrunch("its_garvsharma",bucky);
        makeBrunch("instagram",bucky);
        makeBrunch("faceBook",bucky);

        //Megan
        megan=makeBrunch("Megan",root);
        makeBrunch("Gliter",megan);
        makeBrunch("Makup",megan);

        //Create Tree
        tree=new TreeView<>(root);
//        tree.setShowRoot(false);

        //Layout
        StackPane layout=new StackPane();
        layout.getChildren().add(tree);
        Scene scene=new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
    //Create branches
    private TreeItem<String>makeBrunch(String title,TreeItem<String>parent){
        TreeItem<String>item=new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}
