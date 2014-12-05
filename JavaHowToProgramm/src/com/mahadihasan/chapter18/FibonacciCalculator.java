package com.mahadihasan.chapter18;

import java.math.BigInteger;

/**
 *
 * @author MdMahadiHasan
 */
public class FibonacciCalculator {

    private static BigInteger TWO = BigInteger.valueOf(2);
    public static BigInteger fibonacci(BigInteger number ) {
        
       if(number.equals(BigInteger.ZERO) || 
               number.equals(BigInteger.ONE)) {
           return number;
       }
       else {
           return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
       }
    }
    
    public static void main(String[] args) {
        for (int counter = 0; counter <= 40; counter++) {
            System.out.println("Fibonacci of "+counter+" is "+
                    fibonacci(BigInteger.valueOf(counter)));
        }
    }
}
