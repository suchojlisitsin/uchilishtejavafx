module com.example.uchilisthe_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uchilisthe_javafx to javafx.fxml;
    exports com.example.uchilisthe_javafx;
}