
package com.mahadihasan.chapter08;

/**
 *
 * @author nahid44
 */
public class Time2Test {

    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 54, 42);
        Time2 t5 = new Time2(t4);
        
        
        System.out.println("Constructed with: ");
        System.out.println("t1 all argument defaulted");
        System.out.printf("    %s\n", t1.toUniversalString());
        System.out.printf("    %s\n", t1.toString());
        
        
        System.out.println(
                "t2: hour specified, minute and second defaulted");
        System.out.printf("    %s\n", t2.toUniversalString());
        System.out.printf("    %s\n", t2.toString());
        
        
        System.out.println(
                "t3: hour and minute specified, second defaulted");
        System.out.printf("    %s\n", t3.toUniversalString());
        System.out.printf("    %s\n", t3.toString());
        
        System.out.println(
                "t4: hour, minute and second specified");
        System.out.printf("    %s\n", t4.toUniversalString());
        System.out.printf("    %s\n", t4.toString());
        
        System.out.println(
                "52: Time2 object t4 specified ");
        System.out.printf("    %s\n", t5.toUniversalString());
        System.out.printf("    %s\n", t5.toString());
    
    }
}
