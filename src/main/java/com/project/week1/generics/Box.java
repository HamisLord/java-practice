package com.project.week1.generics;


import java.util.List;

public class Box<T extends Number> {
    private T item = null;

    public T get() {
        if (item != null) {
            T result = item;
            item = null;
            return result;
        }
        return null;
    }

    public void fillWithInts(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public double doubleValue() {
        return  2.0;
    }

    public void put(T addingItem) {
        if (item != null) {
            System.out.println("в ящике что-то есть, нельзя ничего положить");
        }else {
            item = addingItem;
            System.out.println("в ящик было положено: " + addingItem);
        }

    }
}
