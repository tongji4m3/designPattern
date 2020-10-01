package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.store.NYPizzaStore;
import FactoryPattern.AbstractFactory.store.PizzaStore;

public class MainTest
{
    public static void main(String[] args)
    {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
