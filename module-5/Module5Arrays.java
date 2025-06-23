package com.example.test.project01.csd402;

// Scott Macioce
// June 22, 2025
// CSD402 - Module 4 Assignment: Locate Largest and Smallest Elements in 2D Arrays
// Purpose: This program defines overloaded methods to find the location of the largest
// and smallest elements in both double and int 2D arrays

public class Module5Arrays {

    // Method to locate the largest value in a 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2]; // [row, column]
        double max = arrayParam[0][0];

        // Iterate through the array to find the max
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > max) {
                    max = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Method to locate the largest value in a 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > max) {
                    max = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest value in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < min) {
                    min = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest value in a 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < min) {
                    min = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Simple test program to demonstrate functionality
    public static void main(String[] args) {
        int[][] intArray = {
            {5, 8, 3},
            {1, 9, 4},
            {7, 6, 2}
        };

        double[][] doubleArray = {
            {2.3, 4.5, 1.2},
            {9.8, 7.7, 3.3},
            {6.4, 8.1, 5.5}
        };

        int[] maxIntLoc = locateLargest(intArray);
        int[] minIntLoc = locateSmallest(intArray);
        int[] maxDoubleLoc = locateLargest(doubleArray);
        int[] minDoubleLoc = locateSmallest(doubleArray);

        System.out.println("Largest int value is at: (" + maxIntLoc[0] + ", " + maxIntLoc[1] + ")");
        System.out.println("Smallest int value is at: (" + minIntLoc[0] + ", " + minIntLoc[1] + ")");
        System.out.println("Largest double value is at: (" + maxDoubleLoc[0] + ", " + maxDoubleLoc[1] + ")");
        System.out.println("Smallest double value is at: (" + minDoubleLoc[0] + ", " + minDoubleLoc[1] + ")");
    }
}

