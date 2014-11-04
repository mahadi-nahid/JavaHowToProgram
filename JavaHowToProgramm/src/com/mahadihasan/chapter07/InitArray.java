
package com.mahadihasan.chapter07;

/**
 *
 * @author nahid44
 */

public class InitArray {
    
    public static void main(String[] args) {
        
        int[] array;
        
        array = new int[10];
        
        System.out.printf("%s%8s\n", "Index", "Value");
        
        for (int counter = 0; counter < array.length; counter++ )
            System.out.printf("%5d%8d\n", counter, array[counter]);
    }
}
