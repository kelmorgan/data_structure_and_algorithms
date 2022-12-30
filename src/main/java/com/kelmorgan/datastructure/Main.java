package com.kelmorgan.datastructure;

public class Main {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        var stack = new Stack();

        stack.push(3);
        stack.push(8);
        stack.push(5);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.pop());
        stack.push(10);
        stack.push(6);
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isEmpty());


    }

}
