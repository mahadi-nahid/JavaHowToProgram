package com.mahadihasan.chapter11;

import java.util.Scanner;

/**
 *
 * @author MdMahadiHasan
 */
public class DivideByZeroNoExceptionHandling {
    
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter an Integer numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Please enter an Integer denominator:");
        int denominator = scanner.nextInt();
        
        int result = quotient(numerator, denominator);
        
        System.out.println("\nResult: "+numerator+" / " + denominator + " = "+result);
        
    }
}
