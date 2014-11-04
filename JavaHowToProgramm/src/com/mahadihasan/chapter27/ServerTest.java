
package com.mahadihasan.chapter27;

import javax.swing.JFrame;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class ServerTest {
    
    public static void main(String[] args) {
        
        Server application = new Server();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.runServer();
    }
}
