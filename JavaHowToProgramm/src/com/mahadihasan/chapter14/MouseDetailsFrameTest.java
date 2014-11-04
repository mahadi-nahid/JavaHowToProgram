
package com.mahadihasan.chapter14;

import javax.swing.JFrame;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class MouseDetailsFrameTest {
    
    public static void main(String[] args) {
        MouseDetailsFrame mouseFrame = new MouseDetailsFrame();
        
        mouseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseFrame.setSize(300,300);
        mouseFrame.setLocation(20,250);
        mouseFrame.setVisible(true);
    }
}
