package web.javafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import web.javafx.SceneModel;

import java.io.IOException;

public class RegisController {
    @FXML
    AnchorPane regis;
    @FXML
    Hyperlink toLogin;
    @FXML
    void gotoLogin() throws IOException {
        System.out.println("去往登录页面");
        Stage stage = (Stage) regis.getScene().getWindow();
        stage.setScene(SceneModel.goLoginScene());
    }
}
