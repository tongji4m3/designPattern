package FactoryPattern.FactoryMethod.creator;

import FactoryPattern.FactoryMethod.product.ChicagoStyleCheesePizza;
import FactoryPattern.FactoryMethod.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String type)
    {
        return new ChicagoStyleCheesePizza();
    }
}
