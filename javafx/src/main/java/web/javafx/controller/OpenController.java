package web.javafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.JbdcUtil;
import web.javafx.SceneModel;

import java.io.IOException;
import java.sql.Connection;

//需要在此切换到登录界面
public class OpenController   {
    @FXML
    Button login;
    @FXML
    AnchorPane openView;
    @FXML
    void gotoMain() throws IOException {
        System.out.println("gotoMain");
        JbdcUtil db = new JbdcUtil();
        Connection connection = db.getConnection();
        //解释一下：这里的Stage是指当前的窗口，而不是主窗口
        //login.getScene() 获取当前窗口的场景
        //login.getScene().getWindow() 获取当前窗口
        //其余id也可以这样获取
        Stage stage = (Stage) openView.getScene().getWindow();
        stage.setScene(SceneModel.goLoginScene());
    }
}
