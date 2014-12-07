package com.mahadihasan.chapter19;

/**
 *
 * @author MdMahadiHasan
 */
public class SelectionSortTest {

    public static void main(String[] args) {
        SelectionSort sortArray = new SelectionSort(10);
        System.out.println("Unsorted array: ");
   
        System.out.println(sortArray+ "\n");
        
        sortArray.sort();
        
        System.out.println("Sorted array: ");
        System.out.println(sortArray);
    }
}
