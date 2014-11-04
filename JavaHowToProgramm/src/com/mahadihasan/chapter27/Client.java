
package com.mahadihasan.chapter27;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
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
public class Client extends JFrame {
    
    private JTextField enterField;
    private JTextArea displayArea;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String message = "";
    private String chatServer;
    private Socket client;
    
    
    public Client(String host) {
        
        super("Client");
        chatServer = host;
        
        enterField = new JTextField();
        enterField.setEditable(false);
        enterField.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
               
                sendData(event.getActionCommand());
                enterField.setText("");
            }
        });
        
        add(enterField, BorderLayout.NORTH);
        
        displayArea = new JTextArea();
        
        
        add(new JScrollPane(displayArea));
        
        setSize(300,150);
        setVisible(true);
    }
    
    
    public void runClient() {
        
        try{
            connectToServer();
            getStreams();
            processConnection();
        }catch(EOFException eOFException) {
            displayMessage("\nClient terminated connection");
        }
        catch(IOException iOException) {
            iOException.printStackTrace();
        }finally{
            closeConnection();
        }
    }
    
    private void connectToServer() throws IOException {
        
        displayMessage("Attempting Connection\n");
        
        client = new Socket(InetAddress.getByName(chatServer), 12345);
        
        displayMessage("Connected to: "
                + client.getInetAddress().getHostName());
        
        
    }
    
    private void getStreams() throws IOException {
        
        output = new ObjectOutputStream(client.getOutputStream());
        output.flush();
        input = new ObjectInputStream(client.getInputStream());
        
        displayMessage("\nGot I/O streams\n");
        
        
    }
    
    private void processConnection() throws IOException {
        setTextFieldEditable(true);
        
        do{
            try{
                message = (String) input.readObject();
                displayMessage("\n"+message);
                
            }catch(ClassNotFoundException classNotFoundException) {
                displayMessage("\nUnknown object type received");
            }
        }while(!message.equals("SERVER>>> TERMINATE"));
    }
    
    private void closeConnection() {
        
        displayMessage("\nClosing Connection");
        setTextFieldEditable(false);
        
        try{
            output.close();
            input.close();
            client.close();
        }catch(IOException iOException) {
            iOException.printStackTrace();
        }
    }
    
    private void sendData(String message) {
        
        try{
            output.writeObject("CLIENT>>> "+message);
            output.flush();
            displayMessage("\nCLIENT>>> "+message);
        }catch(IOException iOException) {
            displayArea.append("\nError writing object");
            
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
        
        SwingUtilities.invokeLater(
                new Runnable() {

            @Override
            public void run() {
                enterField.setEditable(editable);
            }
        });
    }
    
    
}
