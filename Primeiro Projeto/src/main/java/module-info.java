module com.example.projeto1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projeto1 to javafx.fxml;
    exports com.example.projeto1;
}