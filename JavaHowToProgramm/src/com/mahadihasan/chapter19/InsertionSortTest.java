package com.mahadihasan.chapter19;

/**
 *
 * @author MdMahadiHasan
 */
public class InsertionSortTest {
    
    public static void main(String[] args) {
        InsertionSort sortArray = new InsertionSort(10);
        System.out.println("Unsorted array: ");
   
        System.out.println(sortArray+ "\n");
        
        sortArray.sort();
        
        System.out.println("Sorted array: ");
        System.out.println(sortArray);
    }
}
