package AdapterPattern;

import AdapterPattern.animal.Duck;
import AdapterPattern.animal.MallardDuck;
import AdapterPattern.animal.WildTurkey;

public class DuckTestDrive
{
    public static void main(String[] args)
    {
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck)
    {
        duck.quack();
        duck.fly();
    }
}
