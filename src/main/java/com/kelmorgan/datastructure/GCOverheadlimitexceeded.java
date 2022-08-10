package com.kelmorgan.datastructure;

import java.util.ArrayList;

public class GCOverheadlimitexceeded {
    int x = 1;
    short y = 2;


    public static void main(String[] args) {
        ArrayList<GCOverheadlimitexceeded> list = new ArrayList<>();
        while (true) {
            try {
                list.add(new GCOverheadlimitexceeded());
                System.out.println(list.size());
            } catch (Throwable e) {
                e.printStackTrace();
                System.exit(0);
            }
        }

    }
}