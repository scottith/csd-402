package com.example.test.project01.csd402;
// Scott Macioce
// June 22, 2025
// CSD402 - Module 6 Assignment: Fan Class
// Purpose: This program defines a Fan class with properties such as speed, status, radius, and color.

public class Fan {
    // Constants to represent fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-arg constructor with default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and Setter for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method returns a description of the fan's state
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON: Speed = " + speedToString(speed) + ", Radius = " + radius + ", Color = " + color;
        } else {
            return "Fan is OFF: Radius = " + radius + ", Color = " + color;
        }
    }

    // Helper method to convert speed to string for clarity
    private String speedToString(int speed) {
        switch (speed) {
            case SLOW: return "SLOW";
            case MEDIUM: return "MEDIUM";
            case FAST: return "FAST";
            default: return "STOPPED";
        }
    }

    // Main method to test the Fan class
    public static void main(String[] args) {
        // Create a fan using the default constructor
        Fan defaultFan = new Fan();

        // Create a fan using the argument constructor
        Fan customFan = new Fan(FAST, true, 10.5, "blue");

        // Display fan states
        System.out.println("Default Fan:");
        System.out.println(defaultFan);

        System.out.println("\nCustom Fan:");
        System.out.println(customFan);

        // Demonstrate mutator methods
        defaultFan.setOn(true);
        defaultFan.setSpeed(MEDIUM);
        defaultFan.setRadius(8.0);
        defaultFan.setColor("black");

        System.out.println("\nUpdated Default Fan:");
        System.out.println(defaultFan);
    }
}
