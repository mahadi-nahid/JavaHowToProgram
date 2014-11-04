
package com.mahadihasan.chapter06;

/**
 *
 * @author nahid44
 */
import java.util.Random;

public class RandomInteger {

    public static void main( String[] args) {
        
        Random randomNumbers = new Random();
        
        int face;
        
        for(int counter = 1; counter <= 20; counter++) {
            
            //Random number from 1 to 6
            face = 1 + randomNumbers.nextInt(6);
            
            System.out.printf("%d ", face);
            if(counter % 5 == 0)
                System.out.println();
        }
    }
}
