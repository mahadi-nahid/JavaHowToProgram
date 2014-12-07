package com.mahadihasan.chapter19;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author MdMahadiHasan
 */
public class SelectionSort {

    private int[] data;
    private static final Random generator = new Random();
    
    
    public SelectionSort(int size) {
        data = new int[size];
        
        for (int i = 0; i < size; i++) {
            data[i] = 10 + generator.nextInt(90);
        }
    }
    
    public void sort() {
        int smallest;
        
        for(int i = 0; i < data.length-1; i++) {
            smallest = i;
            
            
            for (int index = i+1; index < data.length; index++) {
                if(data[index] < data[smallest]) {
                    smallest = index;
                }
            }
            
            swap(i, smallest);
            
            printPass(i+1, smallest);
        }
    }
    
    public void swap(int first, int second) {
        int temporary = data[first];
        
        data[first] = data[second];
        data[second] = temporary;
    }
    
    public void printPass(int pass, int index) {
        System.out.println(String.format("after pass %2d: ", pass));
        
        for(int i = 0; i < index; i++) {
            System.out.print(data[i]+" ");
        }
        
        System.out.print(data[index]+"* ");
        
        for(int i = index+1; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        
        System.out.print("\n");
        
        for(int j = 0; j < pass; j++) {
            System.out.print("-- ");
        }
        
        System.out.println("\n");
    }
    
    
    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
