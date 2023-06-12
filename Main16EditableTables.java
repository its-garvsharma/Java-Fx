package com.example.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main16EditableTables extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    TableView<Product>table;
    TextField nameInput,priceInput,quantityInput;
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

        //Name Input
        nameInput=new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        // Price Input
        priceInput=new TextField();
        priceInput.setPromptText("Price");

        //Quantity Input
        quantityInput=new TextField();
        quantityInput.setPromptText("Quantity");

        //Button
        Button addButton=new Button("Add");
        addButton.setOnAction(e-> addButtonClicked());
        Button deleteButton=new Button("Delete");
        deleteButton.setOnAction(e-> deleteButtonCLicked());

        HBox hBox=new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,deleteButton);

        table=new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);

        VBox vBox=new VBox();
        vBox.getChildren().addAll(table,hBox);

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

    //Add Button Clicked
    public void addButtonClicked(){
        Product product=new Product();
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(product);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }

    //Delete Button Clicked

    public void deleteButtonCLicked(){
        ObservableList<Product> productSelected,allProduct;
        allProduct= table.getItems();
        productSelected=table.getSelectionModel().getSelectedItems();

        productSelected.forEach(allProduct :: remove);
    }
}
