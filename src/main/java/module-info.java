module ipap.firstfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ipap.firstfx to javafx.fxml;
    exports ipap.firstfx;
}