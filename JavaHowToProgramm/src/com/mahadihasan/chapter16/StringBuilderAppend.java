package com.mahadihasan.chapter16;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class StringBuilderAppend {

    public static void main(String[] args) {

        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char charecterValue = 'Z';
        int integerValue = 7;
        long longValue = 1000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.33;

        StringBuilder lastBuffer = new StringBuilder("last buffer");
        StringBuilder buffer = new StringBuilder();

        buffer.append(objectRef);
        buffer.append("\n");
        buffer.append(string);
        buffer.append("\n");
        buffer.append(charArray);
        buffer.append("\n");
        buffer.append(charArray, 0, 3);
        buffer.append("\n");
        buffer.append(booleanValue);
        buffer.append("\n");
        buffer.append(charecterValue);
        buffer.append("\n");
        buffer.append(integerValue);
        buffer.append("\n");
        buffer.append(longValue);
        buffer.append("\n");
        buffer.append(floatValue);
        buffer.append("\n");
        buffer.append(doubleValue);
        buffer.append("\n");
        buffer.append(lastBuffer);

        
        System.out.printf("buffer contains %s\n", buffer.toString());
    }
}
