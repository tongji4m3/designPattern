package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.creator.ChicagoPizzaStore;
import FactoryPattern.FactoryMethod.creator.NYPizzaStore;
import FactoryPattern.FactoryMethod.creator.PizzaStore;
import FactoryPattern.FactoryMethod.product.Pizza;

public class MainTest
{
    public static void main(String[] args)
    {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        Pizza pizza2 = chicagoStore.orderPizza("cheese");

    }
}
