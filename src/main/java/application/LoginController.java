package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.util.ResourceBundle;

import java.net.URL;

public class LoginController implements Initializable {

    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView lockImageView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("src/main/resources/application/index-card-gradient-icon-for-dark-theme-small-piece-for-recording-information-flashcards-for-studying-thin-line-color-symbol-modern-style-pictogram-isolated-outline-drawing-vector.jpg");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File lockFile = new File("src/main/resources/application/color-lock-logo-icon-sign-padlock-white-background-color-lock-logo-icon-sign-padlock-148306430.jpg");
        Image lockImage = new Image(lockFile.toURI().toString());
        lockImageView.setImage(lockImage);

    }


    public void loginButtonAction(ActionEvent event){
        if(usernameTextField.getText().isBlank() == false && enterPasswordField.getText().isBlank() ==false){
            validateLogin();
        }
        else{
            loginMessageLabel.setText("Please enter username and password!");

        }

    }
    public void cancelButtonAction(ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void validateLogin(){
        System.out.println("Username: "+usernameTextField.getText());
        System.out.println("Password: " + enterPasswordField.getText());

    }



}