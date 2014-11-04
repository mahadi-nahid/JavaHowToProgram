package com.mahadihasan.chapter20;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class SortedSetTest {

    public static void main(String[] args) {
        
        String[] colors = {"yellow", "green", "black", "tan",
            "grey", "white", "orange", "red", "green"};

        SortedSet<String> tree =
                new TreeSet<String>(Arrays.asList(colors));

        System.out.println("Sorted set: ");
        printSet(tree);

        System.out.println("headSet (\"Orange\"): ");

        printSet(tree.headSet("orange"));
        System.out.println("tailSet (\"Orange\"): ");
        printSet(tree.tailSet("orange"));


        System.out.printf("first : %s\n", tree.first());
        System.out.printf("last : %s\n", tree.last());

    }

    private static void printSet(SortedSet<String> set) {
        for (String s : set) {
            System.out.printf("%s ", s);
        }
        System.out.println("");
    }
}
