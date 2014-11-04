
package com.mahadihasan.chapter25;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class LookAndFeelFrame extends JFrame {
    
    private UIManager.LookAndFeelInfo[] looks;
    private String[] lookNames;
    private JRadioButton[] radio;
    
    private ButtonGroup group;
    private JButton button;
    private JLabel label;
    
    
    private JComboBox comboBox;
    
    
    
    public LookAndFeelFrame() {
        
        super("Look  and Feel Demo");
        
        looks = UIManager.getInstalledLookAndFeels();
        lookNames = new String[looks.length];
        
        for(int i =0; i < looks.length; i++) {
            lookNames[i] = looks[i].getName();
        }
        
        JPanel northPanel = new JPanel();
        
        northPanel.setLayout(new GridLayout(3, 1, 0, 5));
        
        label = new JLabel("This is a" +lookNames[0]+" look-and-feel",
                SwingConstants.CENTER);
        
        northPanel.add(label);
        
        button = new JButton("JButton");
        northPanel.add(button);
        
        comboBox = new JComboBox(lookNames);
        northPanel.add(comboBox);
        
        radio = new JRadioButton[looks.length];
        
        
        JPanel southPanel = new JPanel();
        
        int rows = (int) Math.ceil(radio.length/3.0);
        southPanel.setLayout(new GridLayout(rows, 3));
        
        group = new ButtonGroup();
        
        ItemHandler handler = new ItemHandler();
        
        
        for(int count = 0; count < radio.length; count++) {
            
            radio[count] = new JRadioButton(lookNames[count]);
            radio[count].addItemListener(handler);
            group.add(radio[count]);
            southPanel.add(radio[count]);
        }
        
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        
        radio[0].setSelected(true);
    }
    
    private void changeTheLookAndFeel (int value) {
        
        try{
            UIManager.setLookAndFeel(looks[value].getClassName());
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception exception) {
            
            System.out.println("Exception.....!!!");
        }
    }
    
    private class ItemHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent ie) {
            
            for(int count = 0; count < radio.length; count++) {
                if(radio[count].isSelected()) {
                    label.setText(
                            String.format(
                            "This is a %s look-and-feel", lookNames[count]));
                    comboBox.setSelectedIndex(count);
                    changeTheLookAndFeel(count);
                }
            }
        }
        
    }
    
    
    
    public static void main(String[] args) {
        
        LookAndFeelFrame lookAndFeelFrame = new LookAndFeelFrame();
        lookAndFeelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lookAndFeelFrame.setSize(400,200);
        //lookAndFeelFrame.setResizable(false);
        lookAndFeelFrame.setLocation(250,150);
        lookAndFeelFrame.setVisible(true);
    }
        
}
