package web.javafx;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class SceneModel implements Initializable {
    public static Scene getHelloScene() throws IOException {
        URL openUrl = SceneModel.class.getResource("open-view.fxml");
        System.out.println(openUrl);
        assert (openUrl != null);
        AnchorPane ap = FXMLLoader.load(openUrl);
        return new Scene(ap);
    }
    public static Scene goLoginScene() throws IOException {
        URL loginUrl = SceneModel.class.getResource("login.fxml");
        System.out.println(loginUrl);
        assert (loginUrl != null);
        AnchorPane ap = FXMLLoader.load(loginUrl);
        return new Scene(ap);
    }
    public static Scene goRegisScene() throws IOException {
        URL regisUrl = SceneModel.class.getResource("regis.fxml");
        System.out.println(regisUrl);
        assert (regisUrl != null);
        AnchorPane ap = FXMLLoader.load(regisUrl);
        return new Scene(ap);
    }
    //综合api切换页面
    public static Scene gotoPage(String string, Object... objects){
        URL pageUrl = SceneModel.class.getResource(string);
        System.out.println(pageUrl);
        assert (pageUrl != null);
        AnchorPane ap = null;
        try {
            ap = FXMLLoader.load(pageUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Scene(ap);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
