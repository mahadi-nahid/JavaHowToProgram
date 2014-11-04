package com.mahadihasan.chapter16;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class StringBuilderConstructors {

    public static void main(String[] args) {
        
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffre2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("hello");
        
        System.out.printf("buffer1 = \"%s\"\n", buffer1);
        System.out.printf("buffer2 = \"%s\"\n", buffre2);
        System.out.printf("buffer3 = \"%s\"\n", buffer3);
        
    }
}
