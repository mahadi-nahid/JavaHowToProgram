
package com.mahadihasan.chapter14;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class ComboBoxFrame extends JFrame {
    
    private JComboBox imagesJComboBox;
    
    private JLabel label;
    
    private static final String[] names = 
    {"a.png", "b.png", "c.png", "d.png"};
    
    private Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3])) };
    
    
    public ComboBoxFrame() {
        
        super("Testing JComboBox");
        setLayout(new FlowLayout());
        
        imagesJComboBox = new JComboBox(names);
        imagesJComboBox.setMaximumRowCount(4);
        
        imagesJComboBox.addItemListener(
                new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent event) {
                if(event.getStateChange() == ItemEvent.SELECTED) {
                    label.setIcon(icons[
                            imagesJComboBox.getSelectedIndex()]);
                }
            }
        });
        
        add(imagesJComboBox);
        
        label = new JLabel(icons[0]);
        add(label);
    }
    
}


