
package com.mahadihasan.chapter25;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author MAHADI HASAN NAHID
 */

public class PopupFrame extends JFrame {
    
    private JRadioButtonMenuItem[] items;
    private final Color[] colorValue =
        {Color.BLUE,Color.YELLOW, Color.RED};
    private JPopupMenu popupMenu;
   
    public PopupFrame() {
        
        super("Popup Menues Test");
        
        ItemHandler handler =  new ItemHandler();
        
        String[] colors = {"Blue", "Yellow", "Red"};
        
        ButtonGroup colorGroup = new ButtonGroup();
        popupMenu = new JPopupMenu();
        
        items = new JRadioButtonMenuItem[colors.length];
        
        for(int count = 0; count < items.length; count++) {
            items[count] = new JRadioButtonMenuItem(colors[count]);
            popupMenu.add(items[count]);
            colorGroup.add(items[count]);
            items[count].addActionListener(handler);
            
        }
        
        setBackground(Color.WHITE);
        
        addMouseListener(
                
                new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent event) {
                        checkForTriggerEvent(event);
                    }
                    
                    @Override
                    public void mouseReleased(MouseEvent event) {
                        checkForTriggerEvent(event);
                    }
                    
                    private void checkForTriggerEvent(MouseEvent event) {
                        
                        if(event.isPopupTrigger()) {
                            popupMenu.show(event.getComponent(),
                                    event.getX(), event.getY());
                        }
                    }
               }
       );
    }
    
    
    private class ItemHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
           for(int i = 0; i < items.length; i++) {
               if(ae.getSource() == items[i]) {
                   getContentPane().setBackground(colorValue[i]);
                   return;
               }
           }
        }
        
    }
    
    
    
    public static void main(String[] args) {
        
        PopupFrame myFrame = new PopupFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(300,300);
        myFrame.setLocation(250,150);
        myFrame.setVisible(true);
        myFrame.setResizable(true);
    }
}
