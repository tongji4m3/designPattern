package WrapperPattern.decorator;

import WrapperPattern.Beverage;

//这样得到的是装饰者,即被mocha这个配料装饰后得到的一杯新咖啡
//它不管之前的咖啡是什么种类,也不管之前之后是否被装饰过
public class Milk extends CondimentDecorator
{
    Beverage beverage;

    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription()+",Milk";
    }

    @Override
    public double cost()
    {
        return 0.50+beverage.cost();
    }
}
