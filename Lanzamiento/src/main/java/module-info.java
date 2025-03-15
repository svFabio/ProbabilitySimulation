module com.lanzamientomd.lanzamiento {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lanzamientomd.lanzamiento to javafx.fxml;
    exports com.lanzamientomd.lanzamiento;
    exports com.lanzamientomd.lanzamiento.controllers;
    opens com.lanzamientomd.lanzamiento.controllers to javafx.fxml;
    exports com.lanzamientomd.lanzamiento.models;
    opens com.lanzamientomd.lanzamiento.models to javafx.fxml;
}