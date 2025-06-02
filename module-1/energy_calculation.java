/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test.project01.csd402;


// Scott Macice
// Energy Calculation Program
// This program calculates the energy required in joules to heat water 
// from an initial temperature to a final temperature

/**
 *
 * @author scott
 */
import java.util.Scanner;
public class energy_calculation {
    
    public static void main(String[] args) {

        // Create a Scanner object to capture user input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();  // Store user input as a double

        // Prompt the user to enter the initial temperature in Celsius
        System.out.print("Enter the initial temperature (in Celsius): ");
        double initialTemp = input.nextDouble();

        // Prompt the user to enter the final temperature in Celsius
        System.out.print("Enter the final temperature (in Celsius): ");
        double finalTemp = input.nextDouble();

        // Calculate the energy using the formula Q = mass * (final - initial) * 4184
        double energy = waterMass * (finalTemp - initialTemp) * 4184;

        // Display the result, formatted to two decimal places
        System.out.printf("The energy required to heat %.2f kg of water from %.2f°C to %.2f°C is %.2f joules.%n",
                          waterMass, initialTemp, finalTemp, energy);

        // Close the scanner to avoid resource leaks
        input.close();
    }

}
