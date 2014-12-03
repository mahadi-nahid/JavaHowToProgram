package com.mahadihasan.chapter17;

/**
 *
 * @author MdMahadiHasan
 */
public class CreateTextFileTest {

    public static void main(String[] args) {
        CreateTextFile application = new CreateTextFile();
        
        application.openFile();
        application.addRecords();
        application.closeFile();
    }
}
