package StrategyPattern.fly;

public class FlyRocketPowered implements FlyBehavior
{
    @Override
    public void fly()
    {
        System.out.println("I FlyRocketPowered!");
    }
}
