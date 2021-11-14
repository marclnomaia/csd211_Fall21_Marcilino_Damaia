/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.q1;

/**
 *
 * @author maron
 */
public class App {

    public void run() {

        Person joe = new Person();
        joe.setFirstname("Joe");
        Person jill = new Person("Jill", "Potter");
        Person pete = new Person("Peter", "Apostle", 56);
        Person P1 = new Person(21, 180, 85, "Noel", "Student", 'M');
        Person P2 = new Person(32, 173, 81, "George", "Student", 'M');
        Person P3 = new Person(41, 162, 48.2, "Mary", "Teacher", 'F');
        Person P4 = new Person(21, 180, 85, "Noel", "Student", 'M');

        System.out.println("Joe=" + joe);
        System.out.println("Pete=" + pete);
        System.out.println("Jill=" + jill);

        System.out.println(P1.getAge() + " " + P1.getHeight() + " " + P1.getWeight() + " " + P1.getFirstname() + " " + P1.getLastname() + " " + P1.getGender());
        System.out.println(P2.getAge() + " " + P2.getHeight() + " " + P2.getWeight() + " " + P2.getFirstname() + " " + P2.getLastname() + " " + P2.getGender());
        System.out.println(P3.getAge() + " " + P3.getHeight() + " " + P3.getWeight() + " " + P3.getFirstname() + " " + P3.getLastname() + " " + P3.getGender());
        System.out.println(P4.getAge() + " " + P4.getHeight() + " " + P4.getWeight() + " " + P4.getFirstname() + " " + P4.getLastname() + " " + P4.getGender());
    
         
        

        // same
      if (P1.equals(P2)) {
            System.out.println("P1 and P2 are the same");
        } else {
            System.out.println("P1 and P2 are different people");
        }
        if (P1.equals(P3)) {
            System.out.println("P1 and P3 are the same");
        } else {
            System.out.println("P1 and P3 are different people");
        }

        if (P1.equals(P4)) {
            System.out.println("P1 and P4 are the same");
        } else {
            System.out.println("P1 and P4 are different people");
        }

    }
}
