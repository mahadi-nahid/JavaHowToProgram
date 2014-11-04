
package com.mahadihasan.chapter14;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class MouseDetailsFrame extends JFrame {

    
    
    private String details;
    private JLabel statusBar;
    
    public MouseDetailsFrame() {
        
        super("Mouse Clicks and Buttons");
        
        statusBar = new JLabel("Click The Mouse");
        add(statusBar, BorderLayout.SOUTH);
        MouseClickHandler handler = new MouseClickHandler();
        
        addMouseListener(handler);
        
    }
    
    
    private class MouseClickHandler implements MouseListener, MouseAdapter {

        @Override
        public void mouseClicked( MouseEvent event ) {
            int xPos = event.getX();
            int yPos = event.getY();
            
            details = String.format("Clicked %d Time(s)", 
                    event.getClickCount());
            
            if(event.isMetaDown())
                details += " With Right Mouse Button";
            
            else if(event.isAltDown())
                details += " With Center Mouse Button";
            else 
                details +=" With Left Mouse Button";
            
            statusBar.setText(details);
        }

        @Override
        public void mousePressed(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void mouseExited(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }
}
