
package com.mahadihasan.chapter25;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class DesktopFrame extends JFrame {
    
    private JDesktopPane theDesktop;
    
    public DesktopFrame() {
        
        super("Using a JDesktopPane");
        
        JMenuBar bar = new JMenuBar();
        
        JMenu addMenu = new JMenu("Add");
        JMenuItem newFrame = new JMenuItem("Internal Frame");
        
        addMenu.add(newFrame);
        bar.add(addMenu);
        
        setJMenuBar(bar);
        
        
        theDesktop = new  JDesktopPane();
        add(theDesktop);
        
        newFrame.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JInternalFrame frame = new JInternalFrame(
                        "Internal Frame", true, true, true, true);
                
                MyJPanel panel = new MyJPanel();
                
                frame.add(panel,BorderLayout.CENTER);
                frame.pack();
                
                
                theDesktop.add(frame);
                frame.setVisible(true);
            }
        });
        
    }
    
}


class MyJPanel extends JPanel {
    
    
    private static Random generator = new Random();
    
    private ImageIcon picture;
    private final static String[] images = 
        {"a.png", "b.png", "c.png", "d.png"};
    
    public MyJPanel() {
        int randomNumber = generator.nextInt(images.length);
        picture = new ImageIcon(images[randomNumber]);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        picture.paintIcon(this, g, 0, 0);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(
                picture.getIconWidth(), picture.getIconHeight());
    }
}
