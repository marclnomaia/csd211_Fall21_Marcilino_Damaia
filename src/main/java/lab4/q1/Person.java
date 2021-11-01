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
public class Person extends Object implements java.io.Serializable {  // make it serialzable
    // instance variables
    private int age;
    private double height;
    private double weight;
    private String firstname;
    private String lastname;
    private char gender;
    // Accessors (getters) and Mutators (setters)

    

    public Person() {
        this.firstname="default firstname";
        this.lastname="default lastname";
        this.age=0;
    }
    public Person(String firstname, String lastname ) {
        
        this.firstname = firstname;
        this.lastname = lastname;
       
    }
    
    public Person(String firstname, String lastname,int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        
    }
    
        
    
    public Person(int age, double height,double weight ) {
        this.age = age;
        this.height=height;
        this.height=weight;
        
    }
    
    public Person(int age, double height,double weight,String firstname ) {
        this.age = age;
        this.height=height;
        this.height=weight;
        this.firstname = firstname;
    }
    
     public Person(int age,double height, double weight, String firstname, String lastname ) {
        this.age = age;
        this.height=height;
        this.height=weight;
        this.firstname = firstname;
        this.lastname = lastname;
    }
     
     public Person(int age,double height, double weight, String firstname, String lastname, char gender) {
        this.age = age;
        this.height=height;
        this.height=weight;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender=gender;
    }

   
    
    @Override
    public String toString() {
        return firstname+" "+lastname;
        
    }
    
    public int getAge() {
        return age;
    }

    /*
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /*
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /*
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /*
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /*
     * @param weight the weight to set
     */
public void setWeight(double weight) {
        this.weight = weight;
    }

    
    public String getFirstname() {
        return firstname;
    }

    /*
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /*
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /*
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /*
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /*
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
  }


