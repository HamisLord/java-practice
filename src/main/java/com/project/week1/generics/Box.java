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





    public double getDoubleValue() {
        if (item != null) {
            double result = item.doubleValue();
            item = null;
            return result;
        }
        return -1.0;
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
