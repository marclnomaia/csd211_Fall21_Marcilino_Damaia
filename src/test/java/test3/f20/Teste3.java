/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3.f20;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import test3.f20.*;

/**
 *
 * @author maron
 */
public class Teste3 {
    
    public Teste3() {
    }
   
    Course course1 = new Course("Java", "CSD211","Jan/21",9, 1);
    Course course2 = new Course("C-sharp", "CSD207","Jan/21",9,2);
    Course course3 = new Course("Database", "CSD210","Jan/21",9,4);
    Course course4 = new Course("Database", "CSD210","Jan/22",9,4);
    Course course5 = course2;

    @Before //runs everytime BEFORE a test
    public void before() {
        
    }

    @Test
    public void test1() {
        assertEquals("course1 == course2", false,course1 == course2);
    }

    @Test
    public void test2() {
        assertTrue("course1 != course2", course1 != course2);
    }

    @Test
    public void test3() {
        assertFalse("course1 == course3", course1 == course3);
    }

    @Test
    public void test4() {
        assertNotNull("course1.equals(course3)", course1);
    }

    @Test
    public void test5() {
        assertTrue("course2==course5", course5 == course2);
    }

    
}
    
    

    
