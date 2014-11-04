package com.mahadihasan.chapter21;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class EmptyStackException extends RuntimeException {
    
    public EmptyStackException() {
        this("Stack is Empty");
    }
    public EmptyStackException(String message) {
        super(message);
    }
    
}
