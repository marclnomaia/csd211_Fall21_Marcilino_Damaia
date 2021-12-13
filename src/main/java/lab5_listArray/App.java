/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_listArray;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;



/**
 *
 * @author maron
 */
public class App {
    
  // public class TraverseCollection {

    public static void main(String[] args) {
        // 
        String[] names = {"Joe", "Jim", "Jack", "Jill", "Joe", "Kayleigh"};
        List<String> listOfStrings = new ArrayList<String>(java.util.Arrays.asList(names));

        
        System.out.println("-// traverse method 1 - with iterators------------------------------");
        Iterator it = listOfStrings.iterator();
        while (it.hasNext()) {
            System.out.println("" + it.next());
        }
        System.out.println("-// traverse method 2 - with aggregate methods------------------------------");

        Person1[] pres = {
            new Person1("George W Bush=> " , LocalDate.of( 1946, Month.JULY , 6), Person1.Sex.MALE, "  newsadmin@whitehouse.gov"),
            new Person1("Barack Obama=> " , LocalDate.of( 1961, Month.AUGUST , 4), Person1.Sex.MALE, "  newsadmin@whitehouse.gov"),
            new Person1("Donald Trump=> ", LocalDate.of( 1946, Month.JUNE , 14), Person1.Sex.MALE, "  newsadmin@whitehouse.gov"),
            new Person1("Joe Biden=> ", LocalDate.of( 1942, Month.NOVEMBER , 20), Person1.Sex.MALE, "  newsadmin@whitehouse.gov")
        };

        List<Person1> presidents = java.util.Arrays.asList(pres);

        // iterate using for - each
        for (Person1 president : presidents) {
            System.out.println(president.getName()+" "+ president.getBirthday()+" "+ president.getGender()+" "+ president.getEmailAddress());
        }
        
        // use aggregate operation forEach
       //presidents.stream().forEach(e -> System.out.println(e.getName()+e.getBirthday()+e.getGender()+e.getEmailAddress()));

        
        // 
    }

    void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    

    
}

