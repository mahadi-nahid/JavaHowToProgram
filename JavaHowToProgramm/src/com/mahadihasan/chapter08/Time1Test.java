
package com.mahadihasan.chapter08;

/**
 *
 * @author nahid44
 */
public class Time1Test {
    
    public static void main(String[] args) {
        
        Time1 time = new Time1();
        
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standred time is: ");
        System.out.println(time.toString());
        System.out.println();
        
        time.setTime(13, 27, 6);
        
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standred time after setTime is: ");
        System.out.println(time.toString());
        System.out.println();
        
        try {
            time.setTime(99, 99, 99);
        }
        catch(IllegalArgumentException e) {
            System.out.printf("Exception : %s\n\n", e.getMessage());
        }
        
        System.out.println("After attemping invalid settings: ");
        System.out.print("Universal time: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time: ");
        System.out.println(time.toString());
        System.out.println();
    }
}
