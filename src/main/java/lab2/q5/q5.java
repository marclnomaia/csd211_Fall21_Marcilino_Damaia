/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.q5;

import static lab2.q5.Main.car.year;

/**
 *
 * @author maron
 */

class Main {
 public class car{
      //local variable in Java is a variable that’s declared within the body of a method
       public static int year= 1980;//class variable, because there is only one copy
       
 }
  public static void main(String[] args) {
      // Instance created inorder to access
        // a non static variable.
    // create an object of Test
   
    Car test = new Car();
    test.setAge(41);
    test.setName("Ford Mustang");
    test.setColor("Dark blue");

    // get value of private variables
    System.out.println("age: " + test.getAge()+(" ")+(year));
    System.out.println("Name: " + test.getName());
    System.out.println("Color: " + test.getColor());
   
  }

}
