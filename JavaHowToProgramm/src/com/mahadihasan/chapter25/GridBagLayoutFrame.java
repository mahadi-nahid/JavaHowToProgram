package com.mahadihasan.chapter25;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class GridBagLayoutFrame extends JFrame {

    private GridBagLayout layout;
    private GridBagConstraints constraints;

    public GridBagLayoutFrame() {

        super("GridBagLayout Demo");

        layout = new GridBagLayout();

        setLayout(layout);

        constraints = new GridBagConstraints();

        JTextArea textArea1 = new JTextArea("Text Area 1", 5, 10);
        JTextArea textArea2 = new JTextArea("Text Area 2", 2, 2);



        String[] names = {"Iron", "Steel", "Brass"};

        JComboBox comboBox = new JComboBox(names);

        JTextField textField = new JTextField("Text Field");

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");


        constraints.fill = GridBagConstraints.BOTH;
        addComponent(textArea1, 0, 0, 1, 3);


        constraints.fill = GridBagConstraints.HORIZONTAL;
        addComponent(button1, 0, 1, 2, 1);


        addComponent(comboBox, 2, 1, 2, 1);


        constraints.weightx = 1000;
        constraints.weighty = 1;

        constraints.fill = GridBagConstraints.BOTH;
        addComponent(button2, 1, 1, 1, 1);


        constraints.weightx = 0;
        constraints.weighty = 0;

        addComponent(button3, 1, 2, 1, 1);


        addComponent(textField, 3, 0, 2, 1);
        addComponent(textArea2, 3, 2, 1, 1);



    }

    private void addComponent(Component component,
            int row, int column, int width, int height) {


        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;


        layout.setConstraints(component, constraints);
        add(component);
    }

    public static void main(String[] args) {

        GridBagLayoutFrame gridBagLayoutFrame = new GridBagLayoutFrame();


        gridBagLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridBagLayoutFrame.setSize(400, 200);
        gridBagLayoutFrame.setVisible(true);
        gridBagLayoutFrame.setLocation(400, 350);
        gridBagLayoutFrame.setAlwaysOnTop(true);
    }
}
