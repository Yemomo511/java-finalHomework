package web.javafx.view;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class Exit {
    public static void exitStage(Stage stage){
        stage.setOnCloseRequest(e ->{
            e.consume();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("确认退出");
            alert.setHeaderText(null);
            alert.setContentText("确认退出嘛?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get()==ButtonType.OK){
                Alert alertBuy = new Alert(Alert.AlertType.INFORMATION);
                alertBuy.setTitle("提示");
                alertBuy.setHeaderText(null);
                alertBuy.setContentText("感谢你的使用，再见");
                alertBuy.showAndWait();
                //程序退出
                Platform.exit();
                //窗口关闭
            }
        });
    }
    public static void exitByApi(Stage stage){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("确认退出");
        alert.setHeaderText(null);
        alert.setContentText("确认退出嘛?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get()==ButtonType.OK){
            Alert alertBuy = new Alert(Alert.AlertType.INFORMATION);
            alertBuy.setTitle("提示");
            alertBuy.setHeaderText(null);
            alertBuy.setContentText("感谢你的使用，再见");
            alertBuy.showAndWait();
            //程序退出
            Platform.exit();
        }
    }
}
