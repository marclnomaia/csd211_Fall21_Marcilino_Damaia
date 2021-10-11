/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_2;

/**
 *
 * @author maron
 */
class Car{
int age;  //instance variable
static int numberOfDoors=2;// Class variables
public void about (int a){ //we are using the parameter int a
int nextTenYears= a+ 10;//Local variable
System.out.println(" This car has "+ a + " years,"+ " from 1980 ");
System.out.println(" This Mustang has " + numberOfDoors + " Doors. ");
System.out.println(" Next 10 years, this car will be " + nextTenYears + " years old. ");
};

public static void main(String args[]){
Car Mustang=new Car();
Mustang.age=41;
Mustang.about(Mustang.age);
}
}

