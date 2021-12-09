package com.simpower.controllers;

import com.simpower.Main;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class MenuController {
    @FXML private Button newGameBtn;
    @FXML private Button loadGameBtn;
    @FXML private Button settingsBtn;
    @FXML private Button quitGameBtn; // unused
    @FXML private Button creditsBtn;
    @FXML private Button cheatsBtn;
    @FXML private Button goBackBtn;

    @FXML private Label cheatsLabel;

    @FXML
    protected void quitGame(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    protected void goBack(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/menus/main.fxml"));
        goBackBtn.getScene().setRoot(fxmlLoader.load());
    }

    @FXML
    protected void newGame(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/game.fxml"));
        settingsBtn.getScene().setRoot(fxmlLoader.load());
    }

    // todo: Add loading screen & loads event for saved games
    @FXML
    protected void loadGame(ActionEvent event){
        loadGameBtn.setText("cliqué");
    }

    @FXML
    protected void activateCheats(ActionEvent event){ cheatsBtn.setText("cliqué");}

    @FXML
    protected void openCredits(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/menus/credits.fxml"));
        creditsBtn.getScene().setRoot(fxmlLoader.load());
    }

    @FXML
    protected void openSettings(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/menus/settings.fxml"));
        settingsBtn.getScene().setRoot(fxmlLoader.load());
    }
}
