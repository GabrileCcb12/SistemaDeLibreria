package com.java.FX.Controlador;

import com.java.FX.FxApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;


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

        LoginIngrContraseniaContructor valor = fxml.getController();

        Stage stage = new Stage();
        stage.setTitle("Autenticacion");
        stage.setScene(Autenticacion);
        stage.showAndWait();
        if (valor.isValor()){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/java/Vista/MenuMaestro.fxml"));
            loader.setControllerFactory(FxApplication.context::getBean);
            Scene MenuMaestro = new Scene(loader.load());
            Stage stage1 = new Stage();
            Stage currentStage = (Stage) BtSoyMaestro.getScene().getWindow();
            currentStage.close();
            stage1.setTitle("Menu Maestro");
            stage1.setScene(MenuMaestro);
            stage1.show();
            valor.setValor(false);
        }
    }
}
