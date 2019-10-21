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
public class Admin {
    
        public static void assignCourse(UniPeople person, Course course){
            person.setCourse(course);
            
        }
        
        public static void getDetails(UniPeople person){
            System.out.println("Name: " + person.getName()+ " ID: " + person.id + " Course: " + person.getCourse());
            
        }
}
