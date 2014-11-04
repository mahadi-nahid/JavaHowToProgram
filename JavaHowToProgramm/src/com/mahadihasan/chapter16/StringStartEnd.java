package com.mahadihasan.chapter16;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class StringStartEnd {

    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};


        for (String string : strings) {
            if (string.startsWith("st")) {
                System.out.printf("\"%s\" starts with \"st\"\n", string);

            }
        }

        System.out.println();

        for (String string : strings) {
            if (string.startsWith("art", 2)) {
                System.out.printf("\"%s\" starts with \" art\" at position 2\n", string);
            }
        }

        System.out.println();

        for (String string : strings) {
            if (string.endsWith("ed")) {
                System.out.printf("\"%s\" ends with \"ed\"\n", string);
            }
        }
    }
}
