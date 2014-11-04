
package com.mahadihasan.chapter07;

import javax.swing.JFrame;

/**
 *
 * @author nahid44
 */
public class DrawRainBowTest {

    public static void main(String[] args) {
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400,250);
        application.setVisible(true);
        application.setLocation(200, 100);
        application.setResizable(false);
        
    }
}
