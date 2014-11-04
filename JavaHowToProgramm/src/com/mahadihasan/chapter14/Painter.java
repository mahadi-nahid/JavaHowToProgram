
package com.mahadihasan.chapter14;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author MAHADI HASAN NAHID
 * @see problem 
 */

public class Painter {

    public static void main(String[] args) {
        
        JFrame application = new JFrame("A Simple Paint Programm");
        
        PaintPanel paintPanel = new PaintPanel();
        
        
        application.add(paintPanel, BorderLayout.CENTER);
        
        application.add(new JLabel("Drag The Mouse To Draw"),
                BorderLayout.SOUTH);
        paintPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paintPanel.setSize(300,400);
        paintPanel.setVisible(true);
        
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(300,300);
        application.setLocation(250,250);
        application.setVisible(true);
    }
}
