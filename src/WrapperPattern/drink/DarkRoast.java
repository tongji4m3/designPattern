package WrapperPattern.drink;

import WrapperPattern.Beverage;

public class DarkRoast extends Beverage
{
    public DarkRoast()
    {
        description = "DarkRoast";
    }

    @Override
    public double cost()
    {
        return 1.59;
    }
}
