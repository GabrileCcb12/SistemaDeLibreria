package com.java.FX.Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;

@Controller
public class LoginIngrContraseniaContructor {

    @FXML
    private Button BTaceptar;

    @FXML
    private Button BTcancelar;

    @FXML
    private PasswordField Password;

    boolean valor;

    @FXML
    void onEnterKeyPressed(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)) {
            Aceptar(null); // Llama al método Aceptar que maneja la lógica del botón Aceptar
        }
    }

    @FXML
    void Aceptar(ActionEvent event) {
        valor = Password.getText().equals("AMGS2024");
        if (valor){
            Stage currentStage = (Stage) Password.getScene().getWindow();
            currentStage.close();
        }else {
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

    public boolean isValor() {
        return valor;
    }
    public void setValor(boolean valor){
        this.valor = valor;
    }
}
