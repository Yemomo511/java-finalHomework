package web.javafx.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import web.javafx.view.Exit;

public class Maincontroller {
    @FXML
    AnchorPane main;
    @FXML
    void showProductList(){
        //TODO
    }
    @FXML
    void showCart(){
        //TODO
    }
    @FXML
    void showMyProduct(){
        //TODO
    }
    @FXML
    void showBought(){
        //TODO
    }
    @FXML
    void exit(){
        Stage stage = (Stage) main.getScene().getWindow();
        Exit.exitByApi(stage);
    }
}
