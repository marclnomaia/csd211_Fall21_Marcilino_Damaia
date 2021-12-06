/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_listArray;

import java.time.LocalDate;

/**
 *
 * @author maron
 */
public class Person {
   
    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    } 
    
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the gender
     */
    public Sex getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Sex gender) {
        this.gender = gender;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
     @Override
    public String toString() {

        return name + " " + birthday+ " "+gender+" "+emailAddress;//choose the rariables to print 
    }
}

