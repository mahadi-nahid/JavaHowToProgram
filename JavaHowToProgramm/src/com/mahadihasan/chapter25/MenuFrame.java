
package com.mahadihasan.chapter25;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class MenuFrame extends JFrame {
    
    private final Color[] colorValues =
    {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
    
    private JRadioButtonMenuItem[] colorItems;
    private JRadioButtonMenuItem[] fonts;
    private JCheckBoxMenuItem[] styleItems;
    
    private JLabel displayLabel;
    private ButtonGroup fontButtonGroup;
    private ButtonGroup colorButtonGroup;
    
    public MenuFrame() {
        super("Using JMenues");
        
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        
        JMenuItem aboutItem = new JMenuItem("About...");
        aboutItem.setMnemonic('A');
        
        fileMenu.add(aboutItem);
        
        aboutItem.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               JOptionPane.showMessageDialog(MenuFrame.this, 
                       "This is an Example\nof using Menus",
                       "About", JOptionPane.PLAIN_MESSAGE);
               
            }
        });
        
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('X');
        fileMenu.add(exitItem);
        
        exitItem.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(fileMenu);
        
        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic('r');
        
        String[] colors = {"Black","Blue", "Red", "Green"};
        
        JMenu colorMenu = new JMenu("Color");
        colorMenu.setMnemonic('c');
        
        
        colorItems = new JRadioButtonMenuItem[colors.length];
        colorButtonGroup = new ButtonGroup();
        
        ItemHandler itemHandler = new ItemHandler();
        
        for(int count = 0; count < colors.length; count++) {
            colorItems[count] =
                    new JRadioButtonMenuItem(colors[count]);
            colorMenu.add(colorItems[count]);
            colorButtonGroup.add(colorItems[count]);
            colorItems[count].addActionListener(itemHandler);
        
        }
        
        colorItems[0].setSelected(true);
        formatMenu.add(colorMenu);
        formatMenu.addSeparator();
        
        
        String[] fontNames = {"Serif", "Monospacked", "SansSerif"};
        
        JMenu fontJMenu = new JMenu("Font");
        fontJMenu.setMnemonic('n');
        
        
        fonts = new JRadioButtonMenuItem[fontNames.length];
        
        fontButtonGroup = new ButtonGroup();
        
        for(int count =0; count < fonts.length; count++) {
            fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
            fontJMenu.add(fonts[count]);
            fontButtonGroup.add(fonts[count]);
            fonts[count].addActionListener(itemHandler);
        }
        
        fonts[0].setSelected(true);
        fontJMenu.addSeparator();
        
        String[] styleName = {"Bold", "Italic"};
        
        styleItems = new JCheckBoxMenuItem[styleName.length];
        StyleHandler styleHandler = new StyleHandler();
        
        
        for(int count = 0; count < styleName.length; count++) {
            styleItems[count] = 
                    new JCheckBoxMenuItem(styleName[count]);
            fontJMenu .add(styleItems[count]);
            styleItems[count].addItemListener(styleHandler);
            
        }
        
        
        formatMenu.add(fontJMenu);
        bar.add(formatMenu);
        
        displayLabel = new JLabel("Sample Text", SwingConstants.CENTER);
        displayLabel.setForeground(colorValues[0]);
        displayLabel.setFont(new Font("Serif", Font.PLAIN, 72));
        
        getContentPane().setBackground(Color.CYAN);
        add(displayLabel, BorderLayout.CENTER);
    }
    
    
    private class ItemHandler implements ActionListener {
        private int style;

        @Override
        public void actionPerformed(ActionEvent ae) {
            for(int count = 0; count < colorItems.length; count++) {
                if(colorItems[count].isSelected()) {
                    displayLabel.setForeground(colorValues[count]);
                    break;
                }
            }
            
            for(int count = 0; count < fonts.length; count++) {
                if(ae.getSource() == fonts[count]) {
                    displayLabel.setFont(
                            new Font(fonts[count].getText(), style, 72));
                }
            }
            
            repaint();
        }
        
    }
    
    
    private class StyleHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent ie) {
            
            String name = displayLabel.getFont().getName();
            Font font;
            if(styleItems[0].isSelected() &&
                    styleItems[1].isSelected())
                font = new Font(name, Font.BOLD+Font.ITALIC, 72);
            else if(styleItems[0].isSelected())
                font = new Font(name, Font.BOLD,72);
            else if(styleItems[1].isSelected())
                font = new Font(name, Font.ITALIC, 72);
            else
                font = new Font(name, Font.PLAIN,72);
            
            displayLabel.setFont(font);
            repaint();
        }
        
        
    }
    
    public static void main(String[] args) {
        
        MenuFrame menuFrame = new MenuFrame();
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(600,350);
        menuFrame.setLocation(350,250);
       // menuFrame.setResizable(false);
        menuFrame.setVisible(true);
                
    }
       
}



