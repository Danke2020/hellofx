module hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires static lombok;

    opens org.openjfx to javafx.fxml;
    exports org.openjfx;
}