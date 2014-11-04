package com.mahadihasan.chapter21;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class WildCardTest {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5};
        ArrayList<Integer> integerList = new ArrayList<Integer>();

        integerList.addAll(Arrays.asList(integers));


        System.out.println("integerList contains: " + integerList);
        System.out.println("Total of the elements in integerList: "
                + sum(integerList));




        Double[] doubles = {1.1, 2.2, 3., 4.4, 5.5};
        ArrayList<Double> doubleList = new ArrayList<Double>();

        doubleList.addAll(Arrays.asList(doubles));


        System.out.println("doubleLIst contains: " + doubleList);
        System.out.printf("Total of the elements in doubleLIst: %.1f\n ", 
                sum(doubleList));



        Number[] numbers = {1, 2.2, 3, 4, 5.6};
        ArrayList<Number> numberList = new ArrayList<Number>();

        numberList.addAll(Arrays.asList(numbers));


        System.out.println("numberList contains: " + numberList);
        System.out.printf("Total of the elements in numberList: %.1f\n",
                sum(numberList));
    }

    public static double sum(ArrayList<? extends Number> list) {

        double total = 0;

        for (Number number : list) {
            total += number.doubleValue();
        }
        return total;
    }
}
