package com.mahadihasan.chapter27;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class ClientTest {

    public static void main(String[] args) {

        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
             //com.jtattoo.plaf.texture.TextureLookAndFeel
            //com.jtattoo.plaf.hifi.HiFiLookAndFeel
            //com.jtattoo.plaf.noire.NoireLookAndFeel
            //com.jtattoo.plaf.aero.AeroLookAndFeel

            // start application
            Client application;

            if (args.length == 0) {
                application = new Client("127.0.0.1");
            } else {
                application = new Client(args[0]);
            }

            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            application.runClient();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
