package StrategyPattern.duck;

import StrategyPattern.fly.FlyNoWay;
import StrategyPattern.quack.Quack;

public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println("I am model Duck");
    }
}
