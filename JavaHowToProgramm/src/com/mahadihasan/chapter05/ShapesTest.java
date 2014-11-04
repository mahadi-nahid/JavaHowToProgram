
package com.mahadihasan.chapter05;

/**
 *
 * @author Md Mahadi Hasan Nahid
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
    
    public static void main( String[] args ) {
        
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw Rectangle\n"+
                "Enter 2 to draw Oval");
        
        int choice = Integer.parseInt(input);
        
        Shapes panel = new Shapes( choice );
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
