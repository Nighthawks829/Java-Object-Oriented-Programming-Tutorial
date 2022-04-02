/*
* Name: Liew Shai Sam
* Matrix Number: BI21110266
* Data:2022-03-28
* Title: Lab1 Question2 
*/

public class Temperature {

    // degrees in Fahrenheit
    public double degrees;

    // Return temperature in Fahrenheit
    public double getFahrenheit() {
        return degrees;
    }

    // Return temperature in Celsius
    public double getCelsius() {
        return (5 * (degrees - 32) / 9);
    }

    public static void main(String[] args) {
        
        // Create first temperature object
        Temperature temp1 = new Temperature();
        temp1.degrees = 20;
        System.out.printf("The Fahrenheit temperature of thermometer1 is %.2f\n", temp1.getFahrenheit());
        System.out.printf("The Celsius temperature of thermometer1 is %.2f\n", temp1.getCelsius());

        // Create second temperature object
        Temperature temp2 = new Temperature();
        temp2.degrees = 98.6;
        System.out.printf("The Fahrenheit temperature of thermometer2 is %.2f\n", temp2.getFahrenheit());
        System.out.printf("The Celsius temperature of thermometer2 is %.2f\n", temp2.getCelsius());

    }
}