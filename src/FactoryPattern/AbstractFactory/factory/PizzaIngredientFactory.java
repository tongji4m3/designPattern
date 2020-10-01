package FactoryPattern.AbstractFactory.factory;

import FactoryPattern.AbstractFactory.dough.Dough;
import FactoryPattern.AbstractFactory.sauce.Sauce;

public interface PizzaIngredientFactory
{
    Dough createDough();

    Sauce createSauce();
}
