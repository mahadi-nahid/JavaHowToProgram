package com.mahadihasan.chapter17;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
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
            output.format("%s", "Hello Nahid!!");
        } catch (SecurityException securityException) {
            System.err.println("Youdo not have write access to this file. ");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
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

        while (input.hasNext()) {
            try {
                record.setAccount(input.nextInt());
                record.setFirstName(input.next());
                record.setLastName(input.next());
                record.setBalance(input.nextDouble());

                if (record.getAccount() > 0) {
                    System.out.println("Here --------------");
                    output.format("%d %s %s %.2f\n", record.getAccount(),
                            record.getFirstName(), record.getLastName(),
                            record.getBalance());
                    
                    System.out.println("Pass Trough --------------");
                } else {
                    
                    System.out.println("Account number must be greater than 0.");
                    
                }
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file.");
                return;
            } catch (NoSuchElementException  noSuchElementException) {
                System.err.println("Invalid input. please try again.");
                input.nextLine();
            }
            
            System.out.println("Enter account number ( > 0), "
                    + "first name, last name anad balance. "
                    + "\n ? ");
        }
    }
    
    public void closeFile() {
        if(output != null) {
            output.close();
        }
    }
}
