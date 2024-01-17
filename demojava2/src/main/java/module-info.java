module com.example.demojava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.demojava to javafx.fxml;
    exports com.example.demojava;

    opens com.example.demojava.Controllers to javafx.fxml; // This line is crucial
    exports com.example.demojava.Entitys; // Export your main package if needed
}