package com.java.FX.Controlador;

import com.java.FX.FxApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Optional;

@Controller
public class LoginControlador {

    @FXML
    private Button BtSoyAlumno;

    @FXML
    private Button BtSoyMaestro;

    @FXML
    void IngMenuSoyAlumno(ActionEvent event) {
    }

    @FXML
    void IngMenuSoyMestro(ActionEvent event) throws Exception{
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("/com/java/Vista/VentanasEmergentes/LoginIngrContraseña.fxml"));
        fxml.setControllerFactory(FxApplication.context::getBean);
        Scene Autenticacion = new Scene(fxml.load());
        Stage stage = new Stage();
        stage.setTitle("Autenticacion");
        stage.setScene(Autenticacion);
        stage.show();
    }

}
