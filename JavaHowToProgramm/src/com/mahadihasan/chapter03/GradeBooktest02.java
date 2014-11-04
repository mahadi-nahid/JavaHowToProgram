
package com.mahadihasan.chapter03;


/**
 *
 * @author Md Mahadi Hasan Nahid
 */

import java.util.Scanner;

public class GradeBooktest02 {
    
    public static void main( String[] args ) {
        
        Scanner input = new Scanner( System.in );
        
        GradeBook02 myGradeBook = new GradeBook02();
        
        System.out.printf( "Initial Course Name Is : %s\n\n", 
                myGradeBook.getCourseName());
        System.out.println( "Please Enter The Course Name: ");
        
        String theName = input.nextLine();
        
        myGradeBook.setCourseName( theName );
        System.out.println();
        
        myGradeBook.displayMessage();
    }
}
