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

    public class Car {
    private String make;

    public Car() {
    }

    @Override
    public String toString() {
        return getMake(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Car(String make) {
        this.make = make;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }
    
}

