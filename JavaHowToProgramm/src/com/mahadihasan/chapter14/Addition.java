

package com.mahadihasan.chapter14;

import javax.swing.JOptionPane;

/**
 *
 * @author nahid44
 */
public class Addition {

    public static void main(String[] args) {
        
        String firstNumber = 
                JOptionPane.showInputDialog("Enter The First Number");
        String secondNumber = 
                JOptionPane.showInputDialog("Eneter The Second Number");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int answer = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "The result is : \n" + answer, 
                "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
    }
}
