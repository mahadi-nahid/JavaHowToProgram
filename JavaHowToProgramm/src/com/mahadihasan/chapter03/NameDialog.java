// Fig. 3.18: NameDialog.java

package com.mahadihasan.chapter03;


/**
 *
 * @author Md Mahadi Hasan Nahid
 */

import javax.swing.JOptionPane;

public class NameDialog {
    
    public static void main( String[] args ) {
        String name = 
                JOptionPane.showInputDialog( "What is Your Name?" );
        String message =
                String.format( "Welcome, %s, to Java Programming!", name);
        
        JOptionPane.showMessageDialog(null, message);
    }
}
