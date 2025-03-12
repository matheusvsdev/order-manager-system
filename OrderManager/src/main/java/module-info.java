module com.matheusvsdev.ordermanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.matheusvsdev.ordermanager to javafx.fxml;
    exports com.matheusvsdev.ordermanager;
}