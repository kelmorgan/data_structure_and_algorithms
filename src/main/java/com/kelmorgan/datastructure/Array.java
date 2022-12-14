package com.kelmorgan.datastructure;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        this.items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            System.arraycopy(items, 0, newItems, 0, count);

            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {

        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        System.arraycopy(items, index + 1, items, index, count - index);
        count--;
    }

    public int indexOf(int item) {

        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }

        return -1;
    }


    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
