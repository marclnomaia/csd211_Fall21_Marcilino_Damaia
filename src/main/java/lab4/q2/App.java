/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.q2;
import lab4.q1.Person;
/**
 *
 * @author maron
 */
public class App {

    public void run() {
        Car owner = new Car("Shane", "Mollari");
        Car c1 = new Car("Ford", "Mustang",2015);
        Car c2 = new Car("Chevrolet", "Camaro", 2007, new Person("Shane", "Molari", 40));
        Car c3 = new Car("Ford", "Focus", 2013, 1234);

        System.out.println("Owner" + ":" + owner);
        System.out.println(c1.getMake() + " " + c1.getModel() + " " + c1.getYear());
        System.out.println(c2.getMake() + " " + c2.getModel() + " " + c2.getYear() + " " + c2.getOwner());
        System.out.println(c3.getMake() + " " + c3.getModel() + " " + c3.getYear() + " " + c3.getVin());
        
        
        if (c1.equals(c2)) {
            System.out.println("c1 and c2 are the same");
        } else {
            System.out.println("c1 and c2 are different car");
        }
        if (c1.equals(c3)) {
            System.out.println("c1 and c3 are the same");
        } else {
            System.out.println("c1 and c3 are different car");
        }

        
    }

}
