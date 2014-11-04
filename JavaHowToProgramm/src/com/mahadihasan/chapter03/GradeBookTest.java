// Fig: 3.2

package com.mahadihasan.chapter03;


/**
 *
 * @author Md Mahadi Hasan Nahid
 */
import java.util.Scanner;

public class GradeBookTest {
    
    public static void main( String [] args ) {
        
        Scanner input = new Scanner( System.in );
        
        GradeBook myGradeBook = new GradeBook();
        
        System.out.println( "Please enter the course name:" );
        String nameOfCourse = input.nextLine();
        System.out.println();
        
        myGradeBook.displayMessage( nameOfCourse );
        
    }
    
}
