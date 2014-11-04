
package com.mahadihasan.chapter14;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrame extends JFrame {
    
    private JList colorJList;
    private static final String[] colorNames = {
        "Black", "Blue", "Cyan", "Dark", "Gray", "Green", "Light Gray",
        "Megenta", "Orange", "Pink", "Red", "White", "Yellow"};

    private static final Color[] colors = {
        Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY,
        Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
        Color.PINK, Color.RED, Color.WHITE, Color.YELLOW };
    
    public ListFrame() {
        super("List Test");
        
        setLayout(new FlowLayout());
        
        colorJList = new JList(colorNames);
        colorJList.setVisibleRowCount(5);
        
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        add(new JScrollPane(colorJList));
        
        colorJList.addListSelectionListener(
            new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent event) {
                getContentPane().setBackground(
                        colors[colorJList.getSelectedIndex()]);
            }
        });
        
    }
    


}
