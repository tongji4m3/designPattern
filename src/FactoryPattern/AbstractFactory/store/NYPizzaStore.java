package FactoryPattern.AbstractFactory.store;

import FactoryPattern.AbstractFactory.factory.NYPizzaIngredientFactory;
import FactoryPattern.AbstractFactory.factory.PizzaIngredientFactory;
import FactoryPattern.AbstractFactory.pizza.CheesePizza;
import FactoryPattern.AbstractFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String type)
    {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        pizza = new CheesePizza(ingredientFactory);
        return pizza;
    }
}
