
package com.mahadihasan.chapter25;

import javax.swing.JFrame;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class DesktopFrameTest {
    
    public static void main(String[] args) {
        
        DesktopFrame desktopFrame = new DesktopFrame();
        
        desktopFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        desktopFrame.setSize(400,350);
        desktopFrame.setLocation(250,150);
        desktopFrame.setVisible(true);
        desktopFrame.setResizable(false);
    }
}
