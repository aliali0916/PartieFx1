module fr.insa.elkhounchafi.partiefx1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.insa.elkhounchafi.partiefx1 to javafx.fxml;
    exports fr.insa.elkhounchafi.partiefx1;
}
