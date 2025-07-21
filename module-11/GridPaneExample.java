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
 *
 * Purpose: This JavaFX application demonstrates the use of a GridPane layout by placing
 * multiple buttons in a grid-like structure
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane layout
        GridPane gridPane = new GridPane();

        // Add buttons to the GridPane
        gridPane.add(new Button("Button 1"), 0, 0); // column=0, row=0
        gridPane.add(new Button("Button 2"), 1, 0); // column=1, row=0
        gridPane.add(new Button("Button 3"), 0, 1); // column=0, row=1
        gridPane.add(new Button("Button 4"), 1, 1); // column=1, row=1

        // Create a scene with the GridPane layout
        Scene scene = new Scene(gridPane, 300, 200);

        // Set up the stage
        primaryStage.setTitle("GridPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
