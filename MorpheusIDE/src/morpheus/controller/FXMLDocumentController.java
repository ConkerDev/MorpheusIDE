/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpheus.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author ConkerDev <https://github.com/ConkerDev>
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private MenuItem aboutMorpheusMenu;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleAboutMorpheusMenuAction(ActionEvent event)
                throws IOException {
        Stage stage;
        Parent root;
        
        stage = new Stage();
        
        root= FXMLLoader.load(getClass().getResource("AboutFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("About MorpheusIDE");
        stage.initModality(Modality.APPLICATION_MODAL);
        //stage.initOwner(aboutMorpheusMenu.getScene().getWindow());
        
        stage.showAndWait();
        
    }
    
    @FXML
    private void handleOpenProjectMenuAction(ActionEvent event)
                throws IOException {

        
    }
    
}
