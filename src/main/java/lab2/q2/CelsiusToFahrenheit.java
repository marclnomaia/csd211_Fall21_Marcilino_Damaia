

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2.q2;
/**
 *
 * @author maron
 */
import java.util.Scanner;
 
/**
 * Java Program to convert temperature from 
 * Celsius to Fahrenheit
 */
public class CelsiusToFahrenheit {
    public static void main(String args[]) {
        double celsius, fahren;
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take temperature in Celsius as input from user
        System.out.println("Enter Temperature in Celsius");
        celsius = scanner.nextFloat();
 
        fahren = (9.0 / 5.0) * celsius + 32;
 
        System.out.print("Temperature in Fahrenheit = " + fahren);
    }
}

