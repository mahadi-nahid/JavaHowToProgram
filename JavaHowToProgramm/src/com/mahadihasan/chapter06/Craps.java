
package com.mahadihasan.chapter06;

/**
 *
 * @author nahid44
 */

import java.util.Random;

public class Craps {
    
    private static final Random randomNumbers = new Random();
    
    private enum Status {CONINUE, WON, LOST};
    
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    
    public static void main(String[] args) {
        
        int myPoint = 0;
        Status gameStatus;
        
        int sumOfDice = rollDice();
        
        switch ( sumOfDice ) {
            
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
                
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                 gameStatus = Status.LOST;
                break;
                
            default:
                gameStatus = Status.CONINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d\n", myPoint);
                break;
        }
        
        while (gameStatus == Status.CONINUE) {
            
            sumOfDice = rollDice();
            
            if( sumOfDice == myPoint )
                gameStatus = Status.WON;
            else
                if( sumOfDice == SEVEN ) 
                    gameStatus = Status.LOST;
        }
        
        if( gameStatus == Status.WON ) {
            System.out.println("Paleyer Wins");
        }
        else
            System.out.println("Player Loses");
    }
    
    public static int rollDice() {
        
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        
        int sum = die1 + die2;
        
        System.out.printf("Player Rolled %d + %d = %d\n",
                die1, die2, sum );
        return sum;
    }
}
