module team2.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens application to javafx.fxml;
    exports application;
}