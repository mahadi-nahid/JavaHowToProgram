
package com.mahadihasan.chapter14;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class PaintPanel extends JFrame {
    
    private int pointCount = 0;
    private Point[] points = new Point[10000];
    
    
    public PaintPanel() {
        
        addMouseMotionListener(
                new MouseMotionAdapter() {
            @Override
                    public void mouseDragged(MouseEvent event) {
                        if(pointCount < points.length) {
                            points[pointCount] = event.getPoint();
                            ++pointCount;
                            repaint();
                        }
                    }
                });
    }
    
    public void paintComponent(Graphics g) {
        
        super.paintComponents(g);
        
        for (int i = 0; i < pointCount; i++) {
            g.fillOval(points[i].x, points[i].y, 4, 4);
        }
    }
}
