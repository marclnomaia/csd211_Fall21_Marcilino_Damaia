/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.q3;

/**
 *
 * @author maron
 */
import java.util.Scanner;
 
/**
 * Java Program to convert temperature from 
 * Celsius to Fahrenheit
 */
public class FahrenheitToCelcius {
    public static void main(String args[]) {
        double celsius, fahren;
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take temperature in Fahrenheit as input from user
        System.out.println("Enter Temperature in Fahrenheit");
        fahren = scanner.nextFloat();
 
        celsius= ((fahren-32)*5)/9;
 
        System.out.print("Temperature in Celcius = " + celsius);
    }
}