package FactoryPattern;

import java.util.ArrayList;

public class Pizza
{
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare()
    {
        System.out.println("Preparing--"+name);
        System.out.println("dough--"+dough);
        System.out.println("sauce--"+sauce);
        for (String topping : toppings)
        {
            System.out.println(topping);
        }
        System.out.println("---------------");
    }

    public void bake()
    {
        System.out.println("bake");
    }

    public void cut()
    {
        System.out.println("cut");
    }

    public void box()
    {
        System.out.println("box");
    }

    public String getName()
    {
        return name;
    }
}
