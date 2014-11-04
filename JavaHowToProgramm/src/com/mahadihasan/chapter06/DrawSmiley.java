
package com.mahadihasan.chapter06;

/**
 *
 * @author nahid44
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {
    
    public void paintComponent( Graphics g ) {
        
        super.paintComponent(g);
        
        //draw face
        g.setColor(Color.GREEN);
        g.fillOval(10, 10, 200, 200);
        
        //draw the eyes
        g.setColor(Color.RED);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        
        //darw the mouth
        g.fillOval(50, 110, 100, 60);
        
        //"touch up" the mouth into a smile
        g.setColor(Color.GREEN);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
       
    }
}
