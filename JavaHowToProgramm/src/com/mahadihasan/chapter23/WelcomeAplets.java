
package com.mahadihasan.chapter23;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class WelcomeAplets extends JApplet {
    
    @Override
    public void paint( Graphics g) {
        super.paint(g);
        g.drawString("My Name is Nahid", 25, 25);
    }
}
