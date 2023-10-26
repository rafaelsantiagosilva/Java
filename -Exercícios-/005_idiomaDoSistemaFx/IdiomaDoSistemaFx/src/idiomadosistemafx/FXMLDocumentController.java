/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package idiomadosistemafx;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author rafas
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblBiblioteca;
    private Label lblSistema;
    private Button btnClick;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Locale idioma = Locale.getDefault();
        String sigla = System.getProperty("user.country");
        lblBiblioteca.setText(idioma + sigla);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
