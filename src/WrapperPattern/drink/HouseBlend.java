package WrapperPattern.drink;

import WrapperPattern.Beverage;

public class HouseBlend extends Beverage
{
    public HouseBlend()
    {
        description = "HouseBlend";
    }

    @Override
    public double cost()
    {
        return 0.99;
    }
}
