package com.mahadihasan.chapter08;

import java.util.EnumSet;

/**
 *
 * @author nahid44
 */
public class EnumTest {

    public static void main(String[] args) {
        System.out.println("All books:\n");
        
        for(Book book : Book.values())
            System.out.printf("%-10s%-45s%s\n",
                    book, book.getTitle(), book.getCopyRightYear());
        
        System.out.println("\nDisplay a range of enum constants:\n");
        
        for(Book book : EnumSet.range(Book.JHTP, Book.JCR))
            System.out.printf("%-10s%-45s%s\n",
                    book, book.getTitle(), book.getCopyRightYear());
                
    }
}
