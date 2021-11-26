/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4B_UnitTest;
import static org.junit.Assert.*;
import lab4b_UniTest.Car;
import org.junit.After;
import org.junit.Test;


/**
 *
 * @author maron
 */
public class Test_Part2 {

    Car car1 = new Car("Ford", "Mustang", 2019, 1234l);
    Car car2 = new Car("Toyota", "Camry", 2021, 12345l);
    Car car3 = new Car("Honda", "Civic", 2021, 12342l);
    Car car4 = car1;
    Car car5=null;
    Car car6=car4;
    

    /*@Before //runs everytime BEFORE a test
    public void before() {
        //System.out.println("before()");
//    @After //runs every time after every test
//    public void tearDown() {
//    }
    }*/
    
      @After //runs everytime BEFORE a test
      
    public void tearDown() {
    }
    

    @Test
    public void test1() {
        assertEquals("car1 == car4", true, car1 == car4);
    }

    @Test
    public void test2() {
        assertTrue("car1 != car2", car1 != car2);
    }

    @Test
    public void test3() {
        assertFalse("car1 == car3", car1 == car3);
    }

    @Test
    public void test4() {
        assertNotNull("car1.equals(car3)", car1);
    }

    @Test
    public void test5() {
        assertNull("car1.equals(car3)",car5);
    }

    @Test
    public void test6() {
        assertFalse("car1.equals(car3)", car2.equals(car3));
    }
    @Test
    public void test7() {
        assertFalse("car2.equals(car3)", car2.equals(car3));
    }
    @Test
    public void test8() {
        assertTrue("car6.equals(car4)", car6.equals(car4));
    }
}