/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ermashevsky.docxmaker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author denic
 */
public class AuthUserFormController implements Initializable {

    @FXML
    private Label label;

    @FXML
    public Button loginButton;

    @FXML
    public TextField loginField;

    @FXML
    public PasswordField passwdField;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Welcome");

        try {
            if (!loginField.getText().trim().isEmpty()) {
                Stage stage_login = (Stage) loginButton.getScene().getWindow();
                stage_login.close();

                Parent root = FXMLLoader.load(getClass().getResource("view/Main.fxml"));

                Scene scene = new Scene(root);

                Stage stage = new Stage();

                stage.setScene(scene);
                stage.setTitle("Заполнитель договоров");
                stage.setResizable(false);
                stage.show();
            } else {
                
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Внимание");
                alert.setHeaderText(null);
                alert.setContentText("Необходимо заполнить все поля!");

                alert.showAndWait();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
