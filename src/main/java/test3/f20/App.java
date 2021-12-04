/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3.f20;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author maron
 */
public class App {

    
    private final int numCourse = 10;
    public Course[] courses = new Course[numCourse];
    private Scanner input;
    private int currentIndex;

    public void run() throws Exception {
        Course[] Course = new Course[10];
        boolean quit = false;
        String mainMenu = ""
                + "1. Add  Course\n"
                + "2. Edit Course\n"
                + "3. list Course\n"
                + "0. quit";
        while (!quit) {
            input = new Scanner(System.in);

            System.out.println(mainMenu);
        
            int choice=input.nextInt();

            switch(choice){
                case 1:
                    try {
                        addCourse();
                    } catch (Exception e) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, e);
                    }
                    break;
                case 2:
                    editCourse();
                    break;
                case 3:
                    listCourse();
                    break;
                
                default:
                   // System.out.println("Enter a Choice:");
            }

        }
        System.exit(0);
    }

    private static void editCourse() {
        System.out.println("");
    }
    

    private void addCourse()  {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = input.next();
            System.out.println("Enter code: ");
            int code = input.nextInt();
            System.out.println("Enter date: ");
            int startDate = input.nextInt();
            System.out.println("Enter number of student: ");
            int NumOfStudents = input.nextInt();
            System.out.println("Enter count: ");
            int count = input.nextInt();
        
            Course course = new Course(name,code,startDate, NumOfStudents, count);
         
            courses[currentIndex] = course;
            currentIndex++;

        }catch (Exception e) {
          
        
    }}
         
    private void listCourse() {

        System.out.println("\nList all courses");
        System.out.println("-------------");

        for (int i = 0; i < courses.length; i++) {

            if (courses[i] == null) {
                break;
            }
            System.out.println(i+" "+ courses[i]);

        }
    }
    
    }
    

            
            
            
            
            

           
     

    

    

   
