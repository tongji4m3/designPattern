package FactoryPattern.AbstractFactory.pizza;

import FactoryPattern.AbstractFactory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza
{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory)
    {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare()
    {
        System.out.println("Prepare---"+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
