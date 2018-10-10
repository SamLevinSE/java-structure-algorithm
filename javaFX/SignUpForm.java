package se.esmoa.javaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.*;


public class SignUpForm extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Create a gridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        // add the inputs
        Text sceneTitle = new Text("Sign in here!");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        Label userName = new Label("User Name: ");
        TextField userNameField = new TextField();
        Label userPass = new Label("Password: ");
        PasswordField userPassField = new PasswordField();

        // button
        Button btn = new Button("Go");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(btn);

        // add elements to the grid
        grid.add(sceneTitle, 0,0,2,1);
        grid.add(userName, 0, 1);
        grid.add(userNameField, 1,1);
        grid.add(userPass, 0,2);
        grid.add(userPassField,1,2);
        grid.add(hBox,1,4);

        // just for develop
        // grid.setGridLinesVisible(true);

        final Text actionTarget = new Text();
        grid.add(actionTarget,1,6);

        // lambda function for btn
        btn.setOnAction(event -> {
            actionTarget.setFill(Color.YELLOWGREEN);
            actionTarget.setText("Welcome back " + userNameField.getText() +'!');
        });

        // create the window
        primaryStage.setScene(new Scene(grid, 330, 200));
        primaryStage.setTitle("Sign In Form");
        // show the window
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

