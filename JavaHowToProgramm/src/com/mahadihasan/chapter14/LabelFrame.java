package com.mahadihasan.chapter14;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author nahid44
 */
public class LabelFrame extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame() {
    
        super("Testing Label");
        setLayout(new FlowLayout());
        
        label1 = new JLabel("Label with tesxt");
        label1.setToolTipText("This is label1");
        add(label1);
        
        ImageIcon nahid = new ImageIcon("A.jpg");
        
        label2 = new JLabel("Label with text and icon ", nahid,
                SwingConstants.LEFT);
        label2.setToolTipText("This islabel2");
        add(label2);
        
        label3 = new JLabel();
        label3.setText("label with icon and test at the bottom");
        label3.setIcon(nahid);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
    
    
}
