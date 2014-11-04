
package com.mahadihasan.chapter04;

/**
 *
 * @author Md Mahadi Hasan Nahid
 */
public class GradeBookTest02 {
    
    public static void main( String[] args ) {
        GradeBook02 myGradeBook = new GradeBook02(
                "CSE 233 Object Oriented Programming" );
        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();
    }
}
