
package com.mahadihasan.chapter25;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class JTabbedPaneFrame extends JFrame {
    
    public JTabbedPaneFrame() {
        
        super("JTabbetPane Demo");
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        
        JLabel label1 = new JLabel("Panel One", SwingConstants.CENTER);
        JPanel panel1 = new JPanel();
        
        panel1.add(label1);
        
        tabbedPane.addTab("Tab One", null, panel1, "First Panel");
        
        JLabel label2 = new JLabel("Panel Two", SwingConstants.CENTER);
        JPanel panel2 = new JPanel();
        
        panel2.setBackground(Color.yellow);
        panel2.add(label2);
        
        tabbedPane.addTab("Tab Two", null, panel2, "Second Panel");
        
        
        JLabel label3 = new JLabel(" Panel Three");
        JPanel panel3 = new JPanel();
        
        panel3.setLayout(new BorderLayout());
        
        panel3.add(new JButton("North"), BorderLayout.NORTH);
        panel3.add(new JButton("West"), BorderLayout.WEST);
        panel3.add(new JButton("East"), BorderLayout.EAST);
        
        panel3.add(new JButton("South"), BorderLayout.SOUTH);
        
        panel3.add(label3, BorderLayout.CENTER);
        tabbedPane.addTab("Tab Three", null, panel3, "Third Panel");
        add(tabbedPane);
        
        
        
        
      
    }
    
    
    public static void main(String[] args) {
       
        JTabbedPaneFrame window = new JTabbedPaneFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,300);
        window.setVisible(true);
        window.setLocation(250,250);
    }
}
