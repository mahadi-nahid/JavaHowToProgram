// Fig. 4.7: GradeBookTest.java

package com.mahadihasan.chapter04;

/**
 *
 * @author Md Mahadi Hasan Nahid
 */
public class GradeBookTest {
    public static void main( String[] args ) {
        GradeBook myGradeBook = new GradeBook(
                "CSE 233 Object Oriented Programming" );
        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();
    }
}
