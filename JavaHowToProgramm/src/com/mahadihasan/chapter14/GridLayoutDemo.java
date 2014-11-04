
package com.mahadihasan.chapter14;

import javax.swing.JFrame;

/**
 *
 * @author nahid44
 */
public class GridLayoutDemo {
    
    public static void main(String[] args) {
        
        GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
        gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridLayoutFrame.setLocation(200, 100);
        gridLayoutFrame.setSize(600, 200);
        gridLayoutFrame.setResizable(false);
        gridLayoutFrame.setAlwaysOnTop(true);
        gridLayoutFrame.setVisible(true);
    }
}
