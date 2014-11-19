package com.mahadihasan.chapter11;

import java.util.Scanner;

/**
 *
 * @author MdMahadiHasan
 */
public class AssertTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10 : ");
        int number  = input.nextInt();
        
        assert (number >= 0 && number <= 10) : "Bad Number: "+number;
        
        System.out.println("You Enterd "+number);
    }
}
