package web.javafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import web.javafx.SceneModel;

import java.io.IOException;

public class LoginController {
    boolean checkUser(){
        //TODO
        return true;
    }
    @FXML
    AnchorPane login;
    @FXML
    Hyperlink regesterLink;

    @FXML
    void gotoRegis() throws IOException {
        System.out.println("去往注册页面");
        Stage stage = (Stage) login.getScene().getWindow();
//        stage.setScene(SceneModel.goLoginScene());
        stage.setScene(SceneModel.goRegisScene());
    }
    @FXML
    void gotoMain() throws IOException {
        System.out.println("去往主页面");
        Stage stage = (Stage) login.getScene().getWindow();
        stage.setScene(SceneModel.gotoPage("main.fxml"));
    }
}
