package com.mahadihasan.chapter16;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class StringValueOf {

    public static void main(String[] args) {

        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char charecterValue = 'Z';
        int integerValue = 7;
        long longValue = 1000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.33;
        Object objectRef = "hello";


        System.out.printf("char array = %s\n", String.valueOf(charArray));
        System.out.printf("part of char array = %s\n",
                String.valueOf(charArray, 3, 3));
        System.out.printf("boolean = %s\n", String.valueOf(booleanValue));
        System.out.printf("char = %s\n", String.valueOf(charecterValue));
        System.out.printf("int = %s\n", String.valueOf(integerValue));
        System.out.printf("long = %s\n", String.valueOf(longValue));
        System.out.printf("float = %s\n", String.valueOf(floatValue));
        System.out.printf("double = %s\n", String.valueOf(doubleValue));
        System.out.printf("Object = %s\n", String.valueOf(objectRef));

    }
}
