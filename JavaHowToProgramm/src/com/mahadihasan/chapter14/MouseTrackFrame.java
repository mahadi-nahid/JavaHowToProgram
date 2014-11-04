
package com.mahadihasan.chapter14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class MouseTrackFrame extends JFrame {
    
    private JPanel mousePanel;
    private JLabel statusBar;
    
    public MouseTrackFrame() {
        
        super("Demonastrating Mouse Event");
        
        mousePanel = new JPanel();
        
        mousePanel.setBackground(Color.yellow);
        
        add(mousePanel, BorderLayout.CENTER);
        
        statusBar = new JLabel("Mouse Outside Jpanel");
        add(statusBar, BorderLayout.SOUTH);
        
        
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
        
    }
    
    private class MouseHandler implements MouseListener,
            MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent event) {
            statusBar.setText(String.format("Clicked At [%d %d]",
                    event.getX(), event.getY()));
        }

        @Override
        public void mousePressed(MouseEvent event) {
            statusBar.setText(String.format("Pressed At [%d %d]",
                    event.getX(), event.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent event) {
            statusBar.setText(String.format("Released At [%d %d]",
                    event.getX(), event.getY()));
        }

        @Override
        public void mouseEntered(MouseEvent event) {
            statusBar.setText(String.format("Mouse Entered At [%d %d]",
                    event.getX(), event.getY()));
            mousePanel.setBackground(Color.WHITE);
        }

        @Override
        public void mouseExited(MouseEvent event) {
            statusBar.setText(String.format("Mouse Exited At [%d %d]",
                    event.getX(), event.getY()));
            mousePanel.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseDragged(MouseEvent event) {
            statusBar.setText(String.format("Dragged At [%d %d]",
                    event.getX(), event.getY()));
            
        }

        @Override
        public void mouseMoved(MouseEvent event) {
            statusBar.setText(String.format("Moved At [%d %d]",
                    event.getX(), event.getY()));
        }
        
    }
    
}
