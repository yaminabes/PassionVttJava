module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires unirest.java;

    opens org.application to javafx.fxml;
    exports org.application;
}