module sierpinski {
    requires javafx.controls;
    requires transitive javafx.graphics;

    opens com.megabyte6.sierpinski to javafx.fxml;

    exports com.megabyte6.sierpinski;
}
