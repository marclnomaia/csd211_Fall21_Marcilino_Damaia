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
        
        Person joe=new Person();
        joe.setFirstname("Joe");
        Person jill=new Person("Jill","Potter");
        Person pete=new Person("Peter","Apostle", 56);
        Person noel =new Person(21, 180, 0,"Noel","Student",'M');
        Person george=new Person(32, 173, 0,"George","Student",'M');
        Person mary =new Person(41, 162, 48.2,"Mary","Teacher",'F');
        Person gilles=new Person(35, 176, 61,"Gilles","Student",'F');
    
        
        
        
        
System.out.println("Joe="+joe);
System.out.println("Pete="+pete);
System.out.println("Jill="+jill);
 
//System.out.println(joe.getAge()+" "+joe.getHeight()+" "+ joe.getWeight()+" "+joe.getFirstname()+" "+ joe.getLastname()+" "+ joe.getGender());
System.out.println(george.getAge()+" "+ george.getHeight() +" "+george.getWeight()+" "+ george.getFirstname()+" "+ george.getLastname()+" "+george.getGender());
System.out.println(mary.getAge()+" "+ mary.getHeight()+" "+ mary.getWeight()+" "+mary.getFirstname()+" "+ mary.getLastname()+" "+mary.getGender());
System.out.println(gilles.getAge()+" "+ gilles.getHeight()+" "+ gilles.getWeight()+" "+ gilles.getFirstname()+" "+ gilles.getLastname()+" "+ gilles.getGender());
System.out.println(noel.getAge()+" "+ noel.getHeight()+" "+ noel.getWeight()+" "+ noel.getFirstname()+" "+ noel.getLastname()+" "+ noel.getGender());

    }
}
        
   


        
        //  creating objects
       /* Person susan=new Person();
        susan.setFirstname("Susan");
        susan.setAge(10);
        
        System.out.println("Susans first name is "+susan.getFirstname());
        
        Person susan2=new Person("Susan2", 30);
        
        
        System.out.println("Susans first name is "+susan2.getFirstname());
        
        System.out.println("there are "+countPeople()+ " people created");
        
        
        
        System.out.println("All about susan: "+susan);
        
        int num=10;
        if(num == 10)// checking for equality
            System.out.println("num = 10");
        

        Person george=new Person("George", 33, 12345L);
        Person george2=new Person("George", 33, 12345L);
        Person george3=new Person("George", 33, 123456L);
        Person george4=george2;
        Person george5=george3;
        
        // are george and george2 the same person?
        if(george == george2) // here we are comparing reference NOT objects
            System.out.println("George and George2 are the same");
        else
            System.out.println("George and George2 are different people");

        // previous example doesnt work.  fix it
        if(george.equals(george2)) // here we are comparing objects not references!
            System.out.println("George and George2 are the same");
        else
            System.out.println("George and George2 are different people");

        // not same
        if(george4 == george) 
            System.out.println("George4 and George are the same");
        else
            System.out.println("Georg4e and George are different people");

        // same
        if(george4 == george2) 
            System.out.println("George4 and George are the same");
        else
            System.out.println("George4 and George are different people");

        // same
        if(george4.equals(george2)) 
            System.out.println("George4 and George are the same");
        else
            System.out.println("George4 and George are different people");

       if(george4.equals(george) )
            System.out.println("George4 and George are the same");
        else
            System.out.println("Georg4e and George are different people");
 
    }
    
    public int countPeople(){
        return Person.getCount();
    }
*/




     
     
     

