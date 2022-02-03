module com.example.abstractfactorypattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.abstractfactorypattern to javafx.fxml;
    exports com.example.abstractfactorypattern;
}