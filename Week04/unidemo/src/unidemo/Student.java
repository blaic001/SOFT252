/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author cgblairrains
 */
public class Student extends UniPeople {
    
    
    public void attendClass(){
        System.out.println(name + " is attending " + course.code + " in room "+ course.room);
    }
    
    public void doCoursework(){
        System.out.println(name + " is doing coursework " + course.coursework);
    }
}
