
package com.mahadihasan.chapter06;

/**
 *
 * @author nahid44
 */

import java.util.Scanner;

public class MaximumFinder {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print(
                "Enter three floating point value separeted by spaces: ");
        
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        double result = maximum(number1, number2, number3);
        
        System.out.println("Maximum is " +result);
    }
    
    public static double maximum(double x, double y, double z) {
        
        double maximumValue = x;
        
        if(y > maximumValue)
            maximumValue = y;
        
        if(z > maximumValue)
            maximumValue = z;
        
        return maximumValue;
    }
}
