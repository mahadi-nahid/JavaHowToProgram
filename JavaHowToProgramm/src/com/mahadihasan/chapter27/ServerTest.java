package com.mahadihasan.chapter27;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class ServerTest {

    public static void main(String[] args) {

        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
             //com.jtattoo.plaf.texture.TextureLookAndFeel
            //com.jtattoo.plaf.hifi.HiFiLookAndFeel
            //com.jtattoo.plaf.noire.NoireLookAndFeel
            //com.jtattoo.plaf.aero.AeroLookAndFeel

            // start application
            Server application = new Server();

            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            application.runServer();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
