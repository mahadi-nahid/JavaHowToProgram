
package com.mahadihasan.chapter07;

/**
 *
 * @author nahid44
 */

public class Card {

    private String face;
    private String suit;
    
    public Card(String cardFace, String cardSuit) {
        
        face = cardFace;
        suit = cardSuit;
    }
    
    public String toString(){
        return face + " of " + suit;
    }
}
