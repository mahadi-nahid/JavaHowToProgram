
package com.mahadihasan.chapter04;

/**
 *
 * @author Md Mahadi Hasan Nahid
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    
    public void paintComponent ( Graphics g ) {
        
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        
        g.drawLine(0, 0, width, height);
        
        g.drawLine(0, height, width, 0 );
    }
    
}
