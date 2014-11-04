
package com.mahadihasan.chapter25;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class SliderFrame extends JFrame {
    
    private JSlider diameterJSlider;
    private OvalPanel myPanel;
    
    public SliderFrame() {
        
        super("Slider Demo");
        
        myPanel = new OvalPanel();
        myPanel.setBackground(Color.YELLOW);
        
        diameterJSlider =
                new JSlider(SwingConstants.HORIZONTAL,0,200,10);
        diameterJSlider.setMajorTickSpacing(10);
        diameterJSlider.setPaintTicks(true);
        
        
        diameterJSlider.addChangeListener(
                new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent ce) {
                myPanel.setDiameter(diameterJSlider.getValue());
            }
        });
        
        add(diameterJSlider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }
}
