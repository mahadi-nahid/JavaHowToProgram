
package com.mahadihasan.chapter20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class Sort2 {

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamond", "Clubs", "Spades"};
        
        List<String> list = Arrays.asList(suits);
        
        System.out.printf("Unsorted array elements : %s\n", list);
        
        Collections.sort(list, Collections.reverseOrder());
        
        System.out.printf("Sorted array elemesnts : %s\n", list);
    }
}
