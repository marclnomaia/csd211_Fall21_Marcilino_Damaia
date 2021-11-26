/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars_System;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maron
 */

 class Vehicle {

  // Private Fields
  private String make; 
     
  private String model;   


  // Parameterized Constructor
  public Vehicle(String make, String model) {
    this.make = make;
     
    this.model = model; 
  }

  // public method to print details
  public void printDetails() {
    System.out.println("Manufacturer: " + make);
   
    System.out.println("Model: " + model);
  }
  
}

// Derived Class Car
class Car extends Vehicle {

  // Private field
  private String bodyStyle;

  // Parameterized Constructor
  public Car(String make, String model, String bodyStyle) {
    super(make, model);  //calling parent class constructor
    this.bodyStyle = bodyStyle;       
  }

  public void carDetails() {  //details of car
    printDetails();         //calling method from parent class
    System.out.println("Body Style: " + bodyStyle);
  }
}


class Truck extends Vehicle {

  // Private field
 private String bodyStyle;

  // Parameterized Constructor
  public Truck(String make, String model, String bodyStyle) {
    super(make, model);  //calling parent class constructor
    this.bodyStyle = bodyStyle;       
  }

  public void truckDetails() {  
    printDetails();        
    System.out.println("Body Style: " + bodyStyle);
  }
  
}
class Van extends Vehicle {

  // Private field
 private String bodyStyle;

  // Parameterized Constructor
  public Van(String make, String model, String bodyStyle) {
    super(make, model);  //calling parent class constructor
    this.bodyStyle = bodyStyle;       
  }

  public void vanDetails() {  
    printDetails();        
    System.out.println("Body Style: " + bodyStyle);
  }
  
}
class SUV extends Vehicle {

  // Private field
 private String bodyStyle;

  // Parameterized Constructor
  public SUV(String make, String model, String bodyStyle) {
    super(make, model);  //calling parent class constructor
    this.bodyStyle = bodyStyle;       
  }

  public void suvDetails() {  
    printDetails();        
    System.out.println("Body Style: " + bodyStyle);
  }
  
}




class Main {

  public static void main(String[] args) {
    Car elantraSedan = new Car("Hyundai",  "Elantra","Sedan"); 
    elantraSedan.carDetails(); 
  
    Truck Ford = new Truck("Ford", "F-250", "double cabin"); 
    Ford.truckDetails(); 
    
    Van Toyota = new Van("Toyota", "Alphard", "luxury"); 
    Toyota.vanDetails();
    
    SUV Acura = new SUV("Acura", "RDX", "compact"); 
    Acura.suvDetails();
  }
  
}