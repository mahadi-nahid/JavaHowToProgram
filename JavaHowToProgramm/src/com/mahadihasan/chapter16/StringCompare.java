package com.mahadihasan.chapter16;

/**
 *
 * @author nahid44
 */
public class StringCompare {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf(
                "s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s1, s2, s3, s4);

        if (s1.equals("hello")) {
            System.out.println("s1 equals \"hello\" ");
        } else {
            System.out.println("s1 does not equal \"hello\" ");
        }

        if ("hello".equals(s1)) {
            System.out.println("s1 is the same object as \"hello\"");
        } else {
            System.out.println("s1 is not the same as \"hello\"");
        }

        if (s3.equalsIgnoreCase(s4)) {
            System.out.println(s3 + " equals " + s4 + " with case ignored\n");
        } else {
            System.out.println(s3 + " dose not equals " + s4 + " with case ignored\n");
        }



        System.out.printf(
                "\ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf(
                "\ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf(
                "\ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf(
                "\ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf(
                "\ns4.compareTo(s3) is %d\n\n", s4.compareTo(s3));

        if (s3.regionMatches(0, s4, 0, 5)) {
            System.out.println("First 5 charecter of s3 and s4 match");
        } else {
            System.out.println("First five chatrecter of s3 and s4 do not match");
        }
    }
}
