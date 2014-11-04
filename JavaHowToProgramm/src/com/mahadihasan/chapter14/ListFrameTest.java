
package com.mahadihasan.chapter14;

import javax.swing.JFrame;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class ListFrameTest {
    public static void main(String[] args) {
        
        ListFrame window = new ListFrame();
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,300);
        
        window.setVisible(true);
        window.setLocation(250,250);
    }
}
