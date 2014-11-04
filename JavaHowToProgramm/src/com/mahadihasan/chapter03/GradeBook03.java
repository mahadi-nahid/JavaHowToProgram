//use constructor to initialize course name

package com.mahadihasan.chapter03;


/**
 *
 * @author Md Mahadi Hasan Nahid
 */

public class GradeBook03 {
    
    private String courseName;
    
    public GradeBook03( String name ) {
        courseName = name;
    }
    
    public void setCourseName( String name ) {
        
        courseName = name;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void displayMessage() {
        
        System.out.printf( "Welcome to the grade book for\n%s!\n", 
                getCourseName() );
        
    } 
    
}
