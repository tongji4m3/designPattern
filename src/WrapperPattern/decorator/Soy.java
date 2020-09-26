package WrapperPattern.decorator;

import WrapperPattern.Beverage;
import WrapperPattern.CondimentDecorator;

//这样得到的是装饰者,即被mocha这个配料装饰后得到的一杯新咖啡
//它不管之前的咖啡是什么种类,也不管之前之后是否被装饰过
public class Soy extends CondimentDecorator
{
    Beverage beverage;

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost()
    {
        return 0.80+beverage.cost();
    }
}
