package StrategyPattern;

import StrategyPattern.duck.Duck;
import StrategyPattern.duck.ModelDuck;
import StrategyPattern.fly.FlyRocketPowered;

public class MainTest
{
    public static void main(String[] args)
    {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        /*
        输出:
        I can't flying!
        I FlyRocketPowered!
         */
    }
}
