package com.mahadihasan.chapter18;

/**
 *
 * @author MdMahadiHasan
 */
public class FactorialCalculator {

    public static  long factorial(long number) {
        if(number <= 1) {
            return 1;
        }
        else {
            return number * factorial(number-1);
        }
    }
    
    public static void main(String[] args) {
        for(int counter = 0; counter <= 21; counter++) {
            System.out.println(""+counter+"! = "+factorial(counter));
        }
    }
}
