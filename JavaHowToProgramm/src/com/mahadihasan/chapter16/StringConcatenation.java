package com.mahadihasan.chapter16;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class StringConcatenation {

    public static void main(String[] args) {
        String s1 = "Happy ";
        String s2 = "Birthday";

        System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);
        System.out.println("Result of s1.concat(s2) = " + s1.concat(s2));
        System.out.println("s1 after concatenation = " + s1);
    }
}
