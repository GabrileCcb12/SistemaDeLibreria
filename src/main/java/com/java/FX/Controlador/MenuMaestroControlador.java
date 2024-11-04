package com.java.FX.Controlador;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import org.springframework.stereotype.Component;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class MenuMaestroControlador implements Initializable {
    @FXML
    private HBox BoxLeft;

    @FXML
    private Button BtDetallesPrestamo;

    @FXML
    private ImageView BtDevolucionPrestamo;

    @FXML
    private Button BtEditarLibro;

    @FXML
    private Button BtEliminarLibro;

    @FXML
    private Button BtHistorialLibros;

    @FXML
    private Button BtHistorialPrestamos;

    @FXML
    private ImageView BtListarLibros;

    @FXML
    private Button BtMenuAyuda;

    @FXML
    private Button BtMenuLibros;

    @FXML
    private Button BtMenuPrestamos;

    @FXML
    private Button BtMenuSeguimiento;

    @FXML
    private Button BtNuevoLibro;

    @FXML
    private Button BtRealizarPrestamo;

    @FXML
    private AnchorPane MainMenus;

    @FXML
    private AnchorPane MenuAyuda;

    @FXML
    private AnchorPane MenuLibros;

    @FXML
    private AnchorPane MenuPrestamos;

    @FXML
    private AnchorPane MenuSeguimiento;

    public void switchForm(ActionEvent event){
         System.out.println("g");
        if(event.getSource() == BtMenuPrestamos){
            MenuPrestamos.setVisible(true);
            MenuSeguimiento.setVisible(false);
            MenuLibros.setVisible(false);
            MenuAyuda.setVisible(false);
        }
        else if (event.getSource() == BtMenuLibros) {
            MenuPrestamos.setVisible(false);
            MenuSeguimiento.setVisible(false);
            MenuLibros.setVisible(true);
            MenuAyuda.setVisible(false);
        }
        else if (event.getSource() == BtMenuSeguimiento) {
            MenuPrestamos.setVisible(false);
            MenuSeguimiento.setVisible(true);
            MenuLibros.setVisible(false);
            MenuAyuda.setVisible(false);
        }
        else if (event.getSource() == BtMenuAyuda) {
            MenuPrestamos.setVisible(false);
            MenuSeguimiento.setVisible(false);
            MenuLibros.setVisible(false);
            MenuAyuda.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
