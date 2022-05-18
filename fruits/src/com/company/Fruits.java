package com.company;

public class Fruits {
    String color = "Null";
    String shape = "Null";
    static double weight = 0;

    Fruits(){}
    public Fruits(double weight, String color)
    {
        this.weight = weight;
        this.color = color;
    }

    public static void weight()
    {
        weight+=2;
        System.out.println("Now weight is " + weight + "kg");
    }


    public void addWeight()
    {
        weight++;
        System.out.println("Now weight is " + weight + "kg");
    }

    public String changeColor(String color)
    {
        return color;
    }


}
