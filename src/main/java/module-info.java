module com.example.liufinalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.liufinalproject to javafx.fxml;
    exports com.example.liufinalproject;
}