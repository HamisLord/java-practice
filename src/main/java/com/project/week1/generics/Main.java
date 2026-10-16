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
        System.out.println(firstBox.getDoubleValue());
        System.out.println(firstBox.get());



        List<Integer> list = new ArrayList<>(6);

        Utils.fillWithInts(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(Utils.sum(list));

        List<String> s = new ArrayList<>();
        List<Integer> i = new ArrayList<>();
        System.out.println(s.getClass() == i.getClass());
    }
}
