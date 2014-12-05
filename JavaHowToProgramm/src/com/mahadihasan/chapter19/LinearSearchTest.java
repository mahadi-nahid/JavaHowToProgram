package com.mahadihasan.chapter19;

import java.util.Scanner;

/**
 *
 * @author MdMahadiHasan
 */
public class LinearSearchTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int searchInt;
        int position;

        LinearArray searchArray = new LinearArray(10);

        System.out.println("" + searchArray);

        System.out.println("Please enter an integer value (-1 to quit): ");

        searchInt = input.nextInt();

        while (searchInt != -1) {

            position = searchArray.LinearSearch(searchInt);

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
