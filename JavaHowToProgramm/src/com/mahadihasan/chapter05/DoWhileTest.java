package com.mahadihasan.chapter05;

/**
 *
 * @author Md Mahadi Hasan Nahid
 */
public class DoWhileTest {

    public static void main(String[] args) {

        int counter = 1;

        do {
            System.out.printf("%d ", counter);
            ++counter;

        } while (counter <= 10);

        System.out.println();
    }
}
