/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package entradadedadosfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author rafas
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lblResultado;
    private Button btnSomar;
    private TextField txtN1;
    private TextField txtN2;

    @FXML
    private void cliqueSoma(ActionEvent event) {
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        String soma = Integer.toString(n1 + n2);
        lblResultado.setText(soma);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
