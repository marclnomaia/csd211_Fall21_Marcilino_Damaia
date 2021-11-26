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
public class SocialInsuranceNumber {
    private int sin;

    public SocialInsuranceNumber() {
    }

    public SocialInsuranceNumber(int sin) {
        this.sin = sin;
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof SocialInsuranceNumber))
            return false;
        SocialInsuranceNumber s=(SocialInsuranceNumber)obj;
        if(s.getSin() == this.getSin())
            return true;
        else
            return false;
    }
    

    /**
     * @return the sin
     */
    public int getSin() {
        return sin;
    }

    /**
     * @param sin the sin to set
     */
    public void setSin(int sin) {
        this.sin = sin;
    }
    
}

