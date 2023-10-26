/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package resoluçãodatelafx;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
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
    private Label lblResp;
    private Button btnClick;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimensao = tk.getScreenSize();
        lblResp.setText(dimensao.width + " x " + dimensao.height);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
