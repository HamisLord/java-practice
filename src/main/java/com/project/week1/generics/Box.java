package com.project.week1.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    T box = null;

    public T get() {
        if (box != null) {
            T result = box;
            box = null;
            return result;
        }
        return null;
    }

    public void put(T type) {
        if (box != null) {
            System.out.println("в ящике что-то есть, нельзя ничего положить");
        }else {
            box = type;
            System.out.println("в ящик было положено: " + type);
        }

    }
}
