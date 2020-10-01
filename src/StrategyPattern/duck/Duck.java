package StrategyPattern.duck;

import StrategyPattern.fly.FlyBehavior;
import StrategyPattern.quack.QuackBehavior;

public class Duck
{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior)
    {
        this.quackBehavior = quackBehavior;
    }

    public void performFly()
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void swim()
    {
        System.out.println("All ducks float");
    }

    public void display()
    {
        System.out.println("display duck");
    }
}
