package web.javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
//主窗口的实例
import javafx.scene.control.Alert;

import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import web.javafx.view.Exit;

import java.io.IOException;
import java.util.Optional;

public class HelloApplication extends Application {
    @Override
    //start方法会传入一个实例
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        FXMLLoader openLoader = new FXMLLoader(HelloApplication.class.getResource("open-view.fxml"));


        Scene openScene = SceneModel.getHelloScene();
        stage.setTitle("商店购物系统");
        stage.setScene(openScene);
        Platform.setImplicitExit(false);
        //设置监听
        Exit.exitStage(stage);
        stage.show();
    }
    @Override
    public void init() throws Exception{
        super.init();
        System.out.println("init");
    }
    public void stop() throws Exception{
        super.stop();
        System.out.println("stop");
    }

    public static void main(String[] args) {
        launch();
    }
}