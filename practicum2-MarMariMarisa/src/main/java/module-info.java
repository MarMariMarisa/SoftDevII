module practicum2 {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens practicum2 to javafx.fxml;

    exports practicum2;
}
