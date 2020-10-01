package FactoryPattern.AbstractFactory.pizza;

import FactoryPattern.AbstractFactory.dough.Dough;
import FactoryPattern.AbstractFactory.sauce.Sauce;

public abstract class Pizza
{
    String name;
    Dough dough;
    Sauce sauce;

    public abstract void prepare();


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

    public void setName(String name)
    {
        this.name = name;
    }
}
