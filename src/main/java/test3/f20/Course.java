/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3.f20;

import java.util.Scanner;


/**
 *
 * @author maron
 
 */
  import java.util.ArrayList;

public class Course {
    private String code;
    private String name;
    private String startDate;
    private int NumOfStudents;
    private int count;
    
    
    public Course(String name,String code, String startDate,int NumOfStudents,int count) {
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.NumOfStudents = NumOfStudents;
        this.count = count;
    }

 /*@Override
    public boolean equals(Object obj) {
        if( !(obj instanceof Course)){
            return false;
        }
        Course  c;
        c=(Course)obj;
        if(p.getcode().equals(this.getcode()))
            return true;
        else
            return false;
    }*/
  public Course(String a, String b){
      setCode(a);
      setName(b);
  }

    Course(String name, int code, int startDate, int NumOfStudents, int count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCode(String c){
        code=c;
    }

    String getCode(){
        return code;
     }

    void setName(String n){
         name = n;
    }

    String getName(){
        return name;
     }


    @Override
   public String toString(){

       return code+ " "+ name;
    }
}
