module com.example.uchilisthe_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.uchilisthe_javafx to javafx.fxml;
    exports com.example.uchilisthe_javafx;
}