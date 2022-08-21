package com.kelmorgan.datastructure;

import java.util.Arrays;

public class Main {

    private static long[] fibonacciCache;

    public static void main(String[] args) {

        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(5);
        System.out.println(list.getKthFromTheEnd(3));

    }

}
