package FactoryPattern.AbstractFactory.factory;

import FactoryPattern.AbstractFactory.dough.Dough;
import FactoryPattern.AbstractFactory.dough.ThickCrustDough;
import FactoryPattern.AbstractFactory.sauce.PlumTomatoSauce;
import FactoryPattern.AbstractFactory.sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough()
    {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce()
    {
        return new PlumTomatoSauce();
    }
}
