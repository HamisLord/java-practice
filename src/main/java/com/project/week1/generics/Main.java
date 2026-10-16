package com.project.week1.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Integer> firstBox = new Box<>();
        firstBox.put(5);
        firstBox.put(6);

        System.out.println(firstBox.get());
        System.out.println(firstBox.get());
        firstBox.put(8);
        System.out.println(firstBox.get());

        System.out.println(firstBox.doubleValue());

        List<Integer> list = new ArrayList<>(6);

        firstBox.fillWithInts(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
