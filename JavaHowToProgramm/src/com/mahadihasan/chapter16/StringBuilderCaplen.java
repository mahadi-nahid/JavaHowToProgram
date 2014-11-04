package com.mahadihasan.chapter16;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class StringBuilderCaplen {

    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("hello, how are you?");
        
        System.out.printf("buffer = %s\nlength = %d\ncapacity = %d\n\n", 
                buffer.toString(), buffer.length(), buffer.capacity());
    
        
        buffer.ensureCapacity(75);
        System.out.printf("new capacity  = %d\n\n", buffer.capacity());
        
        buffer.setLength(10);
        System.out.printf("New length = %d\nbuffer = %s\n", 
                buffer.length(), buffer.toString());
    }
}
