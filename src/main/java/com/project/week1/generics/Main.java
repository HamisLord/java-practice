package com.project.week1.generics;

public class Main {
    public static void main(String[] args) {
        Box<String> firstBox = new Box<>();
        firstBox.put("кошка");
        firstBox.put("мышка");

        firstBox.get();
        firstBox.get();
        firstBox.put("мышка");
        firstBox.get();
    }
}
