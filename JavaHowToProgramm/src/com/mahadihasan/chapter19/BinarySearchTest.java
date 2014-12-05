package com.mahadihasan.chapter19;

import java.util.Scanner;

/**
 *
 * @author MdMahadiHasan
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int searchInt;
        int position;
        
        BinaryArray searchArray = new BinaryArray(10);
        System.out.println(""+searchArray);
     
        
        System.out.println("Please enter an integer value (-1 to quit): ");

        searchInt = input.nextInt();

        while (searchInt != -1) {

            position = searchArray.binarySearch(searchInt);

            if (position == -1) {
                System.out.println("The Intiger " + searchInt
                        + " was not found in position ");
            } else {
                System.out.println("The integer " + searchInt
                        + " was found in position " + position);
            }

            System.out.println("Please enter an integer value (-1 to quit): ");

            searchInt = input.nextInt();
        }
    }
}
