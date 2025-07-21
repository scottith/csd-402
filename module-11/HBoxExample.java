/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csd402_project02_javafx;

/**
 *
 * @author scott
 */
/* 
 * Scott Macioce
 * July 20, 2025
 * Module 11
 * Purpose: This JavaFX application demonstrates the use of an HBox layout by placing
 * multiple buttons horizontally within the scene
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Create an HBox layout and add buttons to it
        HBox hbox = new HBox(10); // spacing of 10 pixels between elements
        hbox.getChildren().addAll(button1, button2, button3);

        // Create a scene with the HBox layout
        Scene scene = new Scene(hbox, 300, 100);

        // Set up the stage
        primaryStage.setTitle("HBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
