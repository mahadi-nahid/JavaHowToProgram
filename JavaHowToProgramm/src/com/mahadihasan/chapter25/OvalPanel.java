
package com.mahadihasan.chapter25;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class OvalPanel extends JPanel {
    
    private int diameter = 10;
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.fillOval(10, 10, diameter, diameter);
    }
    
    public void setDiameter(int newDiameter) {
        diameter = (newDiameter >= 0 ? newDiameter : 10);
        repaint();
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
    
    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }
}
