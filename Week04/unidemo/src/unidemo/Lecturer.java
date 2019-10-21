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
public class Lecturer extends UniPeople {
    
    public void setCoursework (String coursework){
        
        course.setCoursework(coursework);
        
        
    }
    
    public void teach (){
        System.out.println(name + "is teaching" + course.code + "in room" + course.room);
    }
    
}
