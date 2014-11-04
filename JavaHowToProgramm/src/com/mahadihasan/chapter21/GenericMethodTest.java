package com.mahadihasan.chapter21;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class GenericMethodTest {
    
    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4,5,6};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6};
        Character[] characterArray = {'H','E','L','L','O'};
        
        System.out.println("Array integerArray contains: ");
        printArray(integerArray);
        System.out.println("\nArray doubleArray contains: ");
        printArray(doubleArray);
        System.out.println("\nArray characterArray contains: ");
        printArray(characterArray);
    }
    
    
    public static <T> void printArray(T[] inputArray) {
        for(T element : inputArray) {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
}
