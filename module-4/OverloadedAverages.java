/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test.project01.csd402;

/**
 *
 * @author scott
 */
// Scott Macioce
// June 15, 2025
// CSD402 - Module 4 Assignment: Overloaded Average Methods

// Purpose: This program defines four overloaded methods to calculate the average of different numeric array types.
// It also tests each method by passing in arrays of different sizes and printing the results clearly.

import java.util.Arrays;

public class OverloadedAverages {

    // Average for short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Average for int array
    public static int average(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // Average for long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Average for double array
    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Main method to test all average methods
    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30};
        int[] intArray = {15, 25, 35, 45};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Display results for each overloaded method
        System.out.println("Short Array:  " + Arrays.toString(shortArray));
        System.out.println("Average:      " + average(shortArray));
        System.out.println();

        System.out.println("Int Array:    " + Arrays.toString(intArray));
        System.out.println("Average:      " + average(intArray));
        System.out.println();

        System.out.println("Long Array:   " + Arrays.toString(longArray));
        System.out.println("Average:      " + average(longArray));
        System.out.println();

        System.out.println("Double Array: " + Arrays.toString(doubleArray));
        System.out.println("Average:      " + average(doubleArray));
    }
}