/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.q1;

/**
 *
 * @author maron
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter the account number to validate:");
        String userInput = myObj.nextLine();  // Read user input

        boolean validityCheck = false; //validation flag
        int finalDigit = 0; 
        do {
            
            String userInputFD = userInput + finalDigit;

            
            String[] userInputArray = userInputFD.split("");

            
            String[] userInputArrayReverse = new String[userInputArray.length]; //create a new reverse array
            int rPos = userInputArray.length - 1;
            for (int i = 0; i < userInputArray.length; i++) { //iterate to reverse positions in the new array initializing by reversing positions
                userInputArrayReverse[i] = userInputArray[rPos--];
            }

            
            int doublePosition; 
            for (int i = 0; i < userInputArrayReverse.length; i++) {
                if (i % 2 != 0) { 
                    doublePosition = Integer.parseInt(userInputArrayReverse[i]) * 2; 
                    userInputArrayReverse[i] = String.valueOf(doublePosition);  
                }
            }

            
            for (int i = 0; i < userInputArrayReverse.length; i++) { 
                if (userInputArrayReverse[i].length() > 1) { 
                    String[] tempArray = userInputArrayReverse[i].split("");
                    int sumElements = 0;  //
                    for (String d : tempArray) { 
                        sumElements = sumElements + Integer.parseInt(d); 
                    }
                    userInputArrayReverse[i] = String.valueOf(sumElements); 
                }
            }

            //4.4 - somar todos os numeros da array
            int finalSum = 0;
            for (String c : userInputArrayReverse) { 
                finalSum = finalSum + Integer.parseInt(c); 
            }

            
            double modSum = 0; 
            modSum = finalSum % 10;

            
            if (modSum == 0.0) {
                validityCheck = true;
                System.out.println("The valid account number to " + userInput + " is: " + userInputFD);
            } else {
                finalDigit++; //increment variable to start again
            }
        }while (validityCheck == false);
    }
}