module com.example.productcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.productcalculator to javafx.fxml;
    exports com.example.productcalculator;
}