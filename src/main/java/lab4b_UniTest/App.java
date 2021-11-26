/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4b_UniTest;

public class App {
    private Car[] cars = new Car[100];
    private Car[] cars2 = new Car[100];
    private int currentIndex = 0;
    
    public void run(){
        //creates cars
        Car car1 = new Car("Ford", "Mustang", 2019, 1234l);
        Car car2 = new Car("Toyota", "Camry", 2021, 12345l);
        Car car3 = new Car("Honda", "Civic", 2021, 12342l);
        Car car4 = car1;
        
        addCar(car1);
        addCar(car2);
        addCar(car3);
        addCar(car4);
        listCar();
        deleteCar(car2);
        listCar();
        System.out.println(findCar(car2));
    }
    public void addCar(Car car){
        cars[currentIndex++] = car;
    }
    
    public void deleteCar(Car car){
        for(int x = 0; x < currentIndex; x++){
            if(car == cars[x]){
                for(int i = 0; i < cars.length; i++){
                    if(i<x){
                        cars2[i] = cars[i];
                    }
                    else if(i>x){
                        cars2[i-1] = cars[i];
                    }
                }
                for(int i = 0; i < currentIndex; i++){
                    cars[i] = cars2[i];
                }
            }
        }
    }
    
    private void listCar(){
        for(int i = 0; i < cars.length; i++){
            if(cars[i] == null)
                break;
            System.out.println((i+1) + ".\n" + cars[i]);
        }
    }
    
    public Car findCar(Car car) {
        for (Car c : cars) {
            if (c == null) {
                return null;
            }
//            if (c.equals(car)) {
            if (car==c) {
                return c;
            }
        }
        return null;
    }
}
/*Person p1=new Person("Joe","Seeber",new SocialInsuranceNumber(123));
        Person p2=new Person("Joe","Seeber",new SocialInsuranceNumber(123));
        Person p3=p1;
        
        if(p1==p2)
            System.out.println("p1==p2 is TRUE");
        else
            System.out.println("p1==p2 is FALSE");
        if(p3==p1)
            System.out.println("p3==p1 is TRUE");
        else
            System.out.println("p3==p1 is FALSE");
        if(p3==p2)
            System.out.println("p3==p2 is TRUE");
        else
            System.out.println("p3==p2 is FALSE");
        if(p3.equals(p2))
            System.out.println("p3.equals(p2) is TRUE");
        else
            System.out.println("p3.equals(p2) is FALSE");
        if(p3.equals(p1))
            System.out.println("p3.equals(p1) is TRUE");*/


   

