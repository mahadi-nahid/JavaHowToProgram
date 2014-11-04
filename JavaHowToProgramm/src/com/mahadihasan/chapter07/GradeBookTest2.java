
package com.mahadihasan.chapter07;

/**
 *
 * @author nahid44
 */
public class GradeBookTest2 {
    
    public static void main(String[] args) {
        
        int[][] gradesArray = {{87, 96, 70}, 
                               {68, 87, 90}, 
                               {94, 100, 90},
                               {100, 81, 82},
                               {83, 65, 85},
                               {78, 87, 65},
                               {85, 75, 83},
                               {91, 94, 100},
                               {76, 72, 84},
                               {87, 93, 73}};
        
        GradeBook2 myGradeBook = new GradeBook2(
                "CSE 233 Object Oriented Programming", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
