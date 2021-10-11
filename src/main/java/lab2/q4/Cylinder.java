/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.q4;

/**
 *
 * @author maron
 */
import java.util.Scanner;//scanner object

public class Cylinder {

 public static void main(String[] args) {
// variables
double radius;
double length;
double volume;

     
 // scanner object
 Scanner keyboard = new Scanner(System.in);

 //Input
 System.out.println("Enter length of the cylinder :=");
 length = keyboard.nextDouble();

 System.out.println("Enter radius of the cylinder :=");
 radius = keyboard.nextDouble();

 // Calculation
 volume=Math.PI*(radius*radius)*length;

 // Output
 System.out.println("Volume of the cylinder="+volume);

 }
}  