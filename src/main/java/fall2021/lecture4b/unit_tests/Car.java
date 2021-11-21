/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2021.lecture4b.unit_tests;

import lab4.q2.*;
import lab4.q1.Person;

/**
 *
 * @author maron
 */

public class Car extends Object implements java.io.Serializable {  // make it serialzable
    // instance variables

    private Person owner;
    private String make;
    private String model;
    private int year;
    private long vin;

    public Car() {
        this.make = "no make";
        this.model = "no model";
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public Car(String make, String model, int year, Person owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.owner = owner;
    }

    public Car(String make, String model, int year, long vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
    }

    @Override
    public String toString() {
        return getMake() + " " + getModel();

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * @return the owner
     */
    public Person getOwner() {
        return owner;
    }

}
