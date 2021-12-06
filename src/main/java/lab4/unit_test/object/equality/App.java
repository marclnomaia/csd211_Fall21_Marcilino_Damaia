/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.unit_test.object.equality;

import java.util.Scanner;

/**
 *
 * @author maron
 */
public class App {
    Scanner input=new Scanner(System.in);
    public void run(){
        Person p1=new Person("Joe","Seeber",new SocialInsuranceNumber(123));
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
            System.out.println("p3.equals(p1) is TRUE");
        else
            System.out.println("p3.equals(p1) is FALSE");
    }
}
