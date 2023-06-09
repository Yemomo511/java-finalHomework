module web.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens web.javafx to javafx.fxml;
    exports web.javafx;
    exports web.javafx.controller;
    opens web.javafx.controller to javafx.fxml;
}