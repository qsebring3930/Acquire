module com.Acquire {
    requires javafx.fxml;
    requires javafx.controls;

    opens com.Acquire to javafx.fxml;
    exports com.Acquire;
}