package com.mahadihasan.chapter17;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author MdMahadiHasan
 */
public class CreateTextFile {
    private Formatter output;
    
    public void openFile() {
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException  securityException) {
            System.err.println("Youdo not have write access to this file. ");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening or creating file. ");
            System.exit(1);
        }
    }
    
    public void addRecords() {
        AccountRecord record = new AccountRecord();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("To terminate input, type the end-of-file indicator"
                + "\nwhen you are promted to enter input."
                + "\nOn UNIX/Linux/Mac OS X type <ctrl> d then press Enter");
        
        System.out.println("Enter account number ( > 0), first name "
                + ", last name and balance ? ");
        
        
    }
}
