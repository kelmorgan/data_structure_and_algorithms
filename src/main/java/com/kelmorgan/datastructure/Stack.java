package com.kelmorgan.datastructure;

import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];

    private int count;

    public void push(int value) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = value;


    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");

        var itemRemoved = items[--count];

        var newItems = new int[count];

        for (int i = 0; i < count; i++) {
            newItems[i] = items[i];
        }

       // var newItems = Arrays.copyOfRange(items,0 , count);
        items = newItems;
        return itemRemoved;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items,0 , count));
    }
}
