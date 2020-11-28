package MultiPattern.factory;

import MultiPattern.decorator.QuackCounter;
import MultiPattern.duck.MallardDuck;
import MultiPattern.duck.Quackable;
import MultiPattern.duck.RedheadDuck;

//使用工厂模式创建的对象,可以确保都经过了装饰者模式进行包装
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }
}
