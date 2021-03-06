module nl.averageflow.nederlandsleraar {
    requires javafx.controls;
    requires javafx.fxml;

    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens nl.averageflow.nederlandsleraar to javafx.fxml;
    exports nl.averageflow.nederlandsleraar;
    exports nl.averageflow.nederlandsleraar.controllers;
    opens nl.averageflow.nederlandsleraar.controllers to javafx.fxml;
    exports nl.averageflow.nederlandsleraar.dto;
}