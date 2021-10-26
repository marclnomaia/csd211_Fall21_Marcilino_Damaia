/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.q2;

/**
 *
 * @author maron
 */
import java.util.regex.*;
import java.util.Scanner;
  
class Main{
      
public static boolean isValid(String s)
{
      
    
    Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
  
    // Pattern class contains matcher() method
    // to find matching between given number 
    // and regular expression
    Matcher m = p.matcher(s);
    return (m.find() && m.group().equals(s));
}
  
// Driver code
public static void main(String[] args)
{
   Scanner myCard = new Scanner(System.in);  
        System.out.println("Enter the account number to validate:");
        String userInput = myCard.nextLine();  // Read user input
      
    if (isValid(userInput)) 
        System.out.println(userInput + ", Valid ");     
    else
        System.out.println(userInput + " ,Invalid ");     
}
}

