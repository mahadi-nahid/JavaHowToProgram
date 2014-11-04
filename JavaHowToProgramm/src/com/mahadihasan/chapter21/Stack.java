package com.mahadihasan.chapter21;

import java.util.ArrayList;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class Stack<T> {

    private ArrayList<T> elements;

    public Stack() {
        this(10);
    }

    public Stack(int capacity) {
        int initcapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<T>(initcapacity);
    }

    public void push(T pushvalue) {
        elements.add(pushvalue);
    }

    public T pop() {
        if (elements.isEmpty()) {
            throw new com.mahadihasan.chapter21.EmptyStackException("Stack is empty, can not pop");
        }
        return elements.remove(elements.size() - 1);
    }
}
