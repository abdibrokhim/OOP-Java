package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("OOP Started!");

        Fruits apple = new Fruits(1, "Red");
        Fruits banana = new Fruits(2, "Yellow");

//        with *static like => Math.random()
        Fruits.weight();

//        without *static
        apple.addWeight();


        System.out.println(apple.changeColor(apple.color));
        System.out.println(banana.changeColor(banana.color));

    }
}
