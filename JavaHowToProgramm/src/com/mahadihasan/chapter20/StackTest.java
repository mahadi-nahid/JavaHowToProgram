package com.mahadihasan.chapter20;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class StackTest {

    public static void main(String[] agrs) {
        Stack<Number> stack = new Stack<Number>();
        
        stack.push(12L);
        System.out.println("Pushed 12L");
        printStack(stack);
        
        stack.push(34567);
        System.out.println("pushed 34567");
        printStack(stack);
        stack.push(1.0F);
        System.out.println("pushed 1.oF");
        printStack(stack);
        
        stack.push(1234.5678);
        System.out.println("pushed 1234.5678");
        printStack(stack);
        
        try {
            Number removedObject = null;
            while(true) {
                removedObject = stack.pop();
                System.out.println("popped "+removedObject);
                printStack(stack);
            }
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        
    }
    
    private static void printStack(Stack<Number> s) {
        if(s.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.printf("Stack Contains: %s(top)\n", s);
        }
    }
}
