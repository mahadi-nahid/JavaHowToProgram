
package com.mahadihasan.chapter16;

/**
 *
 * @author nahid44
 */
public class StringMisellaneous {
    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];
        
        System.out.printf("s1 : %s\n", s1);
        System.out.printf("\nLength of s1: %d", s1.length());
        System.out.printf("\nthe string reversed is: ");
        
        for(int count = s1.length()-1; count >= 0; count--) {
            System.out.printf("%c ", s1.charAt(count));
        }
        
        s1.getChars(0, 5, charArray, 0);
        System.out.print("\nThe Charecter array is: ");
        
        for(char charecter : charArray){
            System.out.print(charecter);
        }
        
      System.out.println();
    }
}
