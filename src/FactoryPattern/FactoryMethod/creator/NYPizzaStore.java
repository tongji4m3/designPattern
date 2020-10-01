package FactoryPattern.FactoryMethod.creator;

import FactoryPattern.FactoryMethod.product.NYStyleCheesePizza;
import FactoryPattern.FactoryMethod.product.Pizza;

public class NYPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String type)
    {
        return new NYStyleCheesePizza();
    }
}
