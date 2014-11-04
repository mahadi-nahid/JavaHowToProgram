
package com.mahadihasan.chapter27;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class Server extends JFrame {
    
    private JTextField enterField;
    private JTextArea displayArea;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;
    private int counter = 1;
    
    
    public Server() {
        
        super("Server");
        
        
        enterField = new JTextField();
        enterField.setEditable(false);
        enterField.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                sendData(ae.getActionCommand());
                enterField.setText("");
            }
        });
        
        
        
        add(enterField, BorderLayout.NORTH);
        
        displayArea = new JTextArea();
        
        add(new JScrollPane(displayArea));
        
        setSize(300,150);
        setVisible(true);
        
    }
    
    public void runServer() {
        
        try {
            
            server = new ServerSocket(12345,100);
            
            while (true) {
                
                try {
                    
                    waitForConnection();
                    getStreams();
                    processConnection();
                    
                } catch (EOFException eofException) {
                    displayMessage("\nServer terminated connection");
                    
                }
                finally {
                    
                    closeConnection();
                    ++counter;
                }
            }
            
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    
    
    private void waitForConnection() throws IOException {
        
        displayMessage("Wqaiting for connection");
        connection = server.accept();
        displayMessage("Connection" +counter+ "received from: "+
                connection.getInetAddress().getHostName());
    }
    
    private void getStreams() throws IOException {
    
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        
        input = new ObjectInputStream(connection.getInputStream());
        
        displayMessage("\nGot I/O streams\n");
    }
    
    
    
    private void processConnection() throws IOException {
        
        String message = "Connection successfull";
        sendData(message);
        
        setTextFieldEditable(true);
        
        do {
            
            try {
                message = (String) input.readObject();
                displayMessage("\n" + message);
                
            } catch (ClassNotFoundException classNotFoundException) {
                
                displayMessage("\nUnknown object type received");
            }
            
        } while (!message.equals("CLIENT>>> TERMINATE"));
        
    }
    
    
    private void closeConnection() {
       
        displayMessage("\nTerminating connection\n");
        setTextFieldEditable(false);
        
        try {
            
            output.close();
            input.close();
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private void sendData(String message) {
        
        try{
            output.writeObject("SERVER>>> "+message);
            output.flush();
            displayMessage("\nSERVER>>> "+message);
            
        }catch(IOException iOException) {
            displayArea.append("\nError writting object");
        }
    }
    
    private void displayMessage(final String messageToDisplay) {
     
        SwingUtilities.invokeLater(
                new Runnable() {

            @Override
            public void run() {
                displayArea.append(messageToDisplay);
            }
        });
    }
    
    
    private void setTextFieldEditable(final boolean editable) {
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                enterField.setEditable(editable);
            }
        });
    }
    
}
