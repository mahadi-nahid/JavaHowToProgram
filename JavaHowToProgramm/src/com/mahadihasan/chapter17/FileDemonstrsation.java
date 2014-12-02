package com.mahadihasan.chapter17;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author MdMahadiHasan
 */
public class FileDemonstrsation {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter file or directory name: ");
        
        analyzePath(input.nextLine());
    }
    
    public static void analyzePath(String path) {
        File name = new File(path);
        
        if(name.exists()) {
            System.out.println(""+name.getName()+"\n"
                    + "exists "+(name.isFile() ? "is a file": "is not a file")+"\n"
                    + ""+(name.isDirectory() ? "is a directory" : "is not a directory")+"\n"
                    + ""+(name.isAbsolute() ? "is absolute path" : "is not absolut path")+"\n"
                            + "Last modified: "+name.lastModified() +"\n"
                            + "Length : "+name.length()+"\n"
                            + "Absolute path :" +name.getAbsolutePath()+"\n"
                    + "Parent : " + name.getParent());
            
           
        }
        
        if(name.isDirectory()) {
            String[] directory = name.list();
            System.out.println("\n\nDirectory contents: \n");
            
            for(String directoryName : directory) {
                System.out.println(""+directoryName);
            }
        }
        
        else {
            System.out.println(""+path+" does not exit");
        }
    }
}
