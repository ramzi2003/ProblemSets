module com.example.miniwebbrowser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miniwebbrowser to javafx.fxml;
    exports com.example.miniwebbrowser;
}