module hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires cloudinary.core;
    requires static lombok;
    requires com.google.gson;

    opens org.openjfx to javafx.fxml;
    exports org.openjfx;
}