package com.example.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main15IntroductionToTable extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    TableView<Product>table;

    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        window.setTitle("Java FX Application!!");

        //Name Column
        TableColumn<Product,String>nameColumn=new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price Column
        TableColumn<Product,Double>priceColumn=new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity Column
        TableColumn<Product,Integer>quantityColumn=new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table=new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);

        VBox vBox=new VBox();
        vBox.getChildren().addAll(table);

        Scene scene=new Scene(vBox);
        window.setScene(scene);
        window.show();
    }
    //get all the product
    public ObservableList<Product>getProduct(){
        ObservableList<Product>products= FXCollections.observableArrayList();
        products.add(new Product("laptop",859.0,20));
        products.add(new Product("Ball",9.0,86));
        products.add(new Product("toilet",838.3,66));
        products.add(new Product("Corn",823.0,12));
        products.add(new Product("Book",8.0,25));
        return products;
    }
}
