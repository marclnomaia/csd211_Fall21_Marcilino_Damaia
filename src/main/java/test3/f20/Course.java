/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3.f20;


/**
 *
 * @author maron
 *
 */


public class Course extends Object implements java.io.Serializable {
    // instance variables

    private String code;
    private String name;
    private String startDate;
    private int numOfStudents;
    private int count;

   

    public Course(String name, String code) {//call constructor with String,String
        this.name = name;
        this.code = code;
    }

    public Course(String name, String code, String startDate, int numOfStudents, int count) {//call constructor with, string,string,string,in,int
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.numOfStudents = numOfStudents;
        this.count = count;
    }

    

    

    @Override
    public boolean equals(Object obj) {//function to compare elements
        if (!(obj instanceof Course)) {
            return false;
        }
        Course c;//create object c to compare the variable code
        c = (Course) obj;
        if (c.getCode().equals(this.getCode())) {
            return true;
        } else {
            return false;
        }
    }

    Course(String name, int code, String startDate, int NumOfStudents, int count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {

        return code + " " + name;//choose the rariables to print 
    }
}