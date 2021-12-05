/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFXApplicationTest;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author didik
 */
public class JavaFXApplicationTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btnRegister = new Button("Register");

        TextField first_field = new TextField();
        TextField last_field = new TextField();
        TextField mail_field = new TextField();
        TextField contact_field = new TextField();
        TextField pass_field = new TextField();
        TextField confirm_field = new TextField();

        Label first_label = new Label("First Name ");
        Label last_label = new Label("Last Name ");
        Label mail_label = new Label("E-Mail Address ");
        Label contact_label = new Label("Contact No ");
        Label pass_label = new Label("Password ");
        Label confirm_label = new Label("Confirm Password ");

        HBox first_h = new HBox();
        HBox last_h = new HBox();
        HBox mail_h = new HBox();
        HBox contact_h = new HBox();
        HBox pass_h = new HBox();
        HBox confirm_h = new HBox();

        VBox fieldholder_v = new VBox();

        first_h.getChildren().addAll(first_label, first_field);
        first_h.setSpacing(57);
        last_h.getChildren().addAll(last_label, last_field);
        last_h.setSpacing(59);
        mail_h.getChildren().addAll(mail_label, mail_field);
        mail_h.setSpacing(30);
        contact_h.getChildren().addAll(contact_label, contact_field);
        contact_h.setSpacing(55);
        pass_h.getChildren().addAll(pass_label, pass_field);
        pass_h.setSpacing(69);
        confirm_h.getChildren().addAll(confirm_label, confirm_field);
        confirm_h.setSpacing(13);

        fieldholder_v.getChildren().addAll(first_h, last_h, mail_h, contact_h, pass_h, confirm_h);
        fieldholder_v.setSpacing(15);

        fieldholder_v.setLayoutX(30);
        fieldholder_v.setLayoutY(30);

        Group group = new Group();
        TilePane tp_Panel2 = new TilePane();

        tp_Panel2.getChildren().addAll(btnRegister);
        btnRegister.setStyle("-fx-background-color: #3d85c6; ");

        tp_Panel2.setLayoutX(150);
        tp_Panel2.setLayoutY(300);

        group.getChildren().addAll(fieldholder_v, tp_Panel2);

        Scene scene = new Scene(group, 400, 350);
        scene.setFill(Color.WHITE);

        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
