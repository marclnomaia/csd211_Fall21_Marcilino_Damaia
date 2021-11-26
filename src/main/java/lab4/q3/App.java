/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.q3;

/**
 *
 * @author maron
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab4.q2.Car;

public class App {

    private final int numCars = 100;
    private Car[] cars = new Car[numCars];
    private Car[] sold = new Car[numCars];
    private int currentCar = 0;
    private int soldCurrentIndex = 0;

    private Scanner input;

    public void run() throws Exception {
        cars = new Car[100];
        boolean quit = false;
        String mainMenu = ""
                + "1. Add Car\n"
                + "2. List Cars\n"
                + "3. Edit Car\n"
                + "4. Delete Car\n"
                + "5. Sell Car\n"
                + "6. Sold Car\n"
                + "0. quit";
        while (!quit) {
            input = new Scanner(System.in);

            System.out.println(mainMenu);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    try {
                    addCar();
                } catch (Exception ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

                case 2:
                    listCars();
                    break;
                case 3:
                    editCar();
                    break;
                case 4:
                    System.out.println("Choose a car to delete");
                    listCars();
                    int choice1 = input.nextInt();
                    deleteCar(choice1);
                   
                    break;
                case 5:
                    sellCar();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid entry try again");
            }
        }
        System.exit(0);
    }

    private static void editCar() {
        System.out.println("Doing option 3 right now");
    }

    //private static void deleteCar() {
    //  System.out.println("Doing option 4 right now");
    //}
    private static void sellCar() {
        System.out.println("Doing option 5 right now");
    }

    private void addCar() throws Exception {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Add Car");
            System.out.println("Enter Make");
            String make = input.next();
            System.out.println("Enter Model");
            String model = input.next();
            System.out.println("Enter Year");
            int year = input.nextInt();
            Car car = new Car(make, model, year);
//            int currentCar = 0;
            cars[currentCar] = car;
            currentCar++;
//            throw new Exception();
        } catch (Exception e) {
            throw new Exception("Error Adding a car");
        }

    }

    private void listCars() {

        System.out.println("\nList all cars");
        System.out.println("-------------");

        for (int i = 0; i < cars.length; i++) {

            if (cars[i] == null) {
                break;
            }
            System.out.println(i+" "+ cars[i]);
//      }
        }
    }

    private void deleteCar(int cardelete) throws Exception {

        try {

            System.out.println("Delete Car");

            for (int i = cardelete; i < cars.length; i++) {
                cars[i - 1] = cars[i];

                currentCar = currentCar--;
            }

        } catch (Exception e) {
            throw new Exception("Error Adding a car");
        }

    }

    private String getInput(String s) {
        String ss = input.nextLine();
        if (s.trim().isEmpty()) {
            return s;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }

    private int getInput(int i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextInt();
    }

    private double getInput(double i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }

    private void deleteCar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void listCars(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
