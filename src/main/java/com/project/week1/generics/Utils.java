package com.project.week1.generics;

import java.util.List;

public class Utils<T extends Number> {
    public static void fillWithInts(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
