
package com.mahadihasan.chapter07;

/**
 *
 * @author nahid44
 */
public class GradeBookTest {

    public static void main(String[] args) {
        
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        
        GradeBook myGradeBook = new GradeBook(
                "CSE 233 Object Oriented Programming ", gradesArray);
        
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
