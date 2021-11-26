/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.unit_test.object.equality;

import lab4.q3.*;

/**
 *
 * @author maron
 */
    public class Person {
    private String firstname;
    private String lastname;
    private SocialInsuranceNumber sin;

    public Person() {
    }

    public Person(String firstname, String lastname, SocialInsuranceNumber sin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.sin = sin;
    }

    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof Person)){
            return false;
        }
        Person p;
        p=(Person)obj;// cast obj to person
        if(p.getSin().equals(this.getSin()))
            return true;
        else
            return false;
    }

    
    
    
    public String getFirstname() {
        return firstname;
    }

    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

   
    public String getLastname() {
        return lastname;
    }

    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the sin
     */
    public SocialInsuranceNumber getSin() {
        return sin;
    }

    /**
     * @param sin the sin to set
     */
    public void setSin(SocialInsuranceNumber sin) {
        this.sin = sin;
    }
    
    
    
}
