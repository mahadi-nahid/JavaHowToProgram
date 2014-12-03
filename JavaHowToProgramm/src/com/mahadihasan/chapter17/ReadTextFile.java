package com.mahadihasan.chapter17;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author MdMahadiHasan
 */
public class ReadTextFile {
    private Scanner input;
    
    public void openFile() {
        try {
            input = new Scanner(new File("clients.txt"));
        } catch (Exception e) {
        }
    }
}
