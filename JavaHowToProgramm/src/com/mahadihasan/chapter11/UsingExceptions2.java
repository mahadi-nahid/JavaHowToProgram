package com.mahadihasan.chapter11;

/**
 *
 * @author MdMahadiHasan
 */
public class UsingExceptions2 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            System.err.println(""+exception.getMessage()+"\n");
            exception.printStackTrace();
        
            StackTraceElement[] traceElements = exception.getStackTrace();
            System.out.println("\nStack trace from getStackTrace: ");
            System.out.println("Class\t\tFile\t\tLine\tMethod");
            
            for(StackTraceElement element : traceElements) {
                System.out.println(""+element.getClassName()+"\t");
                System.out.println(""+element.getFileName()+"\t");
                System.out.println(""+element.getLineNumber()+"\t");
                System.out.println(""+element.getMethodName()+"\t");
            }
            
        }
        
        
    }
    
    public static void method1() throws Exception {
        method2();
    }
    
    public static void method2() throws Exception {
        method3();
    }
    
    public static void method3() throws Exception {
        throw  new Exception("Exception thrown in method3");
    }
        
}
