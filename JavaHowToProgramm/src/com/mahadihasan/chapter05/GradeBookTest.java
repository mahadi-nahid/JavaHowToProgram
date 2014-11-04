
package com.mahadihasan.chapter05;

/**
 *
 * @author Md Mahadi Hasan Nahid
 */
public class GradeBookTest {

    public static void main ( String[] args ) {
        
        GradeBook myGradeBook = new GradeBook(
                "CSE 233 Object Oriented Programming");
        
        myGradeBook.displayMessage();
        myGradeBook.inputGrades();
        myGradeBook.displayGradeReport();
    }
}
