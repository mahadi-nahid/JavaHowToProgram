package com.mahadihasan.chapter21;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class TotalNumbers {

    public static void main(String[] args) {

        Number[] numbers = {1, 2.4, 3, 4.1};

        ArrayList<Number> numberList = new ArrayList<Number>();
        
        
        
        numberList.addAll(Arrays.asList(numbers));
        
        //for (Number element : numbers) {
        //    numberList.add(element);
       // }

        System.out.println("numberList contains: " + numberList);
        System.out.println("Total of the elements in numberList: "
                + sum(numberList));
    }

    public static double sum(ArrayList<Number> list) {
        double total = 0;

        for (Number element : list) {
            total += element.doubleValue();
        }
        return total;
    }
}
