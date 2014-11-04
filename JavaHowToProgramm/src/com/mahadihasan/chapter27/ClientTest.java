
package com.mahadihasan.chapter27;

import javax.swing.JFrame;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class ClientTest {
    
    public static void main(String[] args) {
        Client application;
        
        if(args.length == 0) {
            application = new Client("127.0.0.1");
        }
        else{
            application = new Client(args[0]);
        }
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.runClient();
    }
}
