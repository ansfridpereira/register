package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private TextField username,password;

    @FXML
    private Label Register;


    @FXML
    protected void onaddButtonClick()
    {
        double first =Double.parseDouble(username.getText());
        double second =Double.parseDouble(password.getText());


    }
    @FXML
    protected void onLoginButtonClick() {Register.setText("Registration succesful");
    }
}