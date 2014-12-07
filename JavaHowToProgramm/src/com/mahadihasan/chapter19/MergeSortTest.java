package com.mahadihasan.chapter19;

/**
 *
 * @author MdMahadiHasan
 */
public class MergeSortTest {
    public static void main(String[] args) {
        MergeSort sortArray = new MergeSort(10);
        
        System.out.println("Unsorted: "+sortArray+"\n");
        
        sortArray.sort();
        
        System.out.println("Sorted: "+sortArray);
    }
}
