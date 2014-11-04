// Fig. 4.9: GradeBook.java

package com.mahadihasan.chapter04;

/**
 *
 * @author Md Mahadi Hasan Nahid
 */
import java.util.Scanner;

public class GradeBook02 {
    private String courseName;
    
    public GradeBook02( String name ) {
        courseName = name;
    }
    
    public void setCourseName( String name ) {
        courseName = name;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void displayMessage() {
        System.out.printf( "Welcome to the grade book for\n%s\n\n",
                getCourseName());
    }
    
    public void determineClassAverage() {
        Scanner input = new Scanner( System.in );
        
        int total;
        int gradeCounter;
        int grade;
        double average;
        
        total = 0;
        gradeCounter = 0;
        
        System.out.print( "Enter Grade or -1 to Quit: " );
        grade = input.nextInt();
        
        while ( grade != -1 ) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            
            System.out.print( "Enter Grade or -1 to Quit: ");
            grade = input.nextInt();
        }
        
        if (gradeCounter != 0) {
            average = (double) total / gradeCounter;
            
            System.out.printf( "\nTotal of the %d grades entered is %d\n",
                    gradeCounter, total);
            System.out.printf( "Class average is %.2f\n", average );
            
        }
        else
            System.out.println( "No grades were entered" );
        
    }
}
