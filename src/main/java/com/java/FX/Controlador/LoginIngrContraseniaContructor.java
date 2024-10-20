package com.java.FX.Controlador;

import com.java.FX.FxApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class LoginIngrContraseniaContructor {

    @FXML
    private Button BTaceptar;

    @FXML
    private Button BTcancelar;

    @FXML
    private PasswordField Password;

    @FXML
    void onEnterKeyPressed(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)) {
            Aceptar(null); // Llama al método Aceptar que maneja la lógica del botón Aceptar
        }
    }

    @FXML
    void Aceptar(ActionEvent event) {

        if (Password.getText().equals("AMGS2024")) {

            FXMLLoader fxml = new FXMLLoader(getClass().getResource("/com/java/Vista/MenuMaestro.fxml"));
            fxml.setControllerFactory(FxApplication.context::getBean);
            Scene MenuMaestro;
            try {
                MenuMaestro = new Scene(fxml.load());
            } catch (IOException e) {
                throw new RuntimeException("Ha ocurrido un error" + e);
            }
            Stage stage = new Stage();

            stage.setTitle("Verificacion");
            stage.setScene(MenuMaestro);
            stage.show();
            Stage currentStage = (Stage) Password.getScene().getWindow();
            currentStage.close();
        }else {
            // Crear una alerta de tipo ERROR
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de Autenticación");
            alert.setHeaderText("Contraseña Incorrecta");
            alert.setContentText("La contraseña que ingresaste no es correcta. Inténtalo de nuevo.");

            // Mostrar la alerta y esperar que el usuario la cierre
            alert.showAndWait();
        }
    }
    @FXML
    void Cancelar(ActionEvent event) {
        Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        currentStage.close();
    }

}
