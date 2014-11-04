
package com.mahadihasan.chapter24;

/**
 *
 * @author nahid44
 */
import java.applet.AudioClip;
import java.awt.event.ItemListener;

import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class LoadAudioAndPlay extends JApplet{
    
    private AudioClip sound1, sound2, currentSound;
    private JButton playJButton, loopJButton, stopJButton;
    private JComboBox soundJComboBox;
    
    
    
    public void init() {
        setLayout( new FlowLayout() );

        String choices[] = { "Welcome","Hi"};
        soundJComboBox =new JComboBox( choices ); // create JComboBox

        soundJComboBox.addItemListener(

            new ItemListener()// anonymous inner class
            {
                // stop sound and change sound to user's selection
                public void itemStateChanged( ItemEvent e )
                {
                 currentSound.stop();
                 currentSound = soundJComboBox.getSelectedIndex() == 0?
                sound1 : sound2;
                 }// end method itemStateChanged
            }// end anonymous inner class
       ); 
        
        
        
       add( soundJComboBox );// add JComboBox to applet

        // set up button event handler and buttons
        ButtonHandler handler = new ButtonHandler();

        // create Play JButton
        playJButton =new JButton("Play" );
        playJButton.addActionListener( handler );
        add( playJButton );

        // create Loop JButton
        loopJButton =new JButton("Loop" );
        loopJButton.addActionListener( handler );
        add( loopJButton );

        // create Stop JButton
        stopJButton =new JButton("Stop" ); 
        
        
        stopJButton.addActionListener( handler );
        add( stopJButton );

        // load sounds and set currentSound


        currentSound = sound1;
      
    } // end method init

    // stop the sound when the user switches web pages
     public void stop()
     {
         currentSound.stop(); // stop AudioClip
     } // end method stop

     // private inner class to handle button events
     private class ButtonHandler implements ActionListener
     {
          // process play, loop and stop button events
          public void actionPerformed( ActionEvent actionEvent )
          {
               if ( actionEvent.getSource() == playJButton )
                    currentSound.play();
               else if ( actionEvent.getSource() == loopJButton )
                    currentSound.loop();
               else if ( actionEvent.getSource() == stopJButton )
                    currentSound.stop();
        } // end method actionPerformed
    } // end class ButtonHandler
}// end class LoadAudioAndPlay
       
