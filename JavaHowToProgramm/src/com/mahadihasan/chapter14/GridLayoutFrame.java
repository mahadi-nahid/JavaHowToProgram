
package com.mahadihasan.chapter14;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author nahid44
 */
public class GridLayoutFrame extends JFrame implements ActionListener {

    private JTextArea textArea1;
    //private JTextField textField1;
    private JButton[] buttons;
    
    private static final String[] names =
         { "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P",
         "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z",
         "X", "C", "V", "B", "N", "M"};
    
    private boolean toggle = true;
    private Container container;
    private GridLayout gridLayout1;
    private GridLayout gridLayout2;
    
    public GridLayoutFrame() {
        
        super("GrideLayout Demo");
        gridLayout1 = new GridLayout(3, 3, 5, 5);
        gridLayout2 = new GridLayout(3, 2);
        
        
        container = getContentPane();
        
        setLayout(gridLayout1);
        textArea1 = new JTextArea(200,5);
        //textField1 = new JTextField(50);
        buttons = new JButton[names.length];
        add(textArea1);
        //add(textField1);
        for(int count = 0; count < names.length; count++ ) {
            
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
            add(buttons[count]);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        
        if(toggle)
          container.setLayout(gridLayout2);
      else
           container.setLayout(gridLayout1);
       
      toggle = !toggle;
        container.validate();
        
        for(int i =0;i<buttons.length;i++){
            
            if(event.getSource() == buttons[i]){
                textArea1.append(names[i]);
                //textField1.setText(names[i]);
            }
        }
  
    }
    
}
