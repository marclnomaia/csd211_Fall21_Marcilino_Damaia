/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.q5;

/**
 *
 * @author maron
 */
public class Car {
    
  // private variables
  // non-static variables like age,name, color are declared in a class outside any method, constructor or block.
  private int age;
  private String name;//parameters are define as public or private within classes
  private String color;
  
  // initialize age
  public void setAge(int year) {
    this.age = year;
  }

  // initialize name
  public void setName(String name) {
    this.name = name;
  }
  //inicialize color
 public void setColor(String color) {
    this.color = color;
  }
  // access age
  public int getAge() {
    return this.age;
  }

  // access name
  public String getName() {
    return this.name;
  }
  
  public String getColor() {
    return this.color;
  }
 
}
