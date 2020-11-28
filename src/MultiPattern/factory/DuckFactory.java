package MultiPattern.factory;

import MultiPattern.duck.MallardDuck;
import MultiPattern.duck.Quackable;
import MultiPattern.duck.RedheadDuck;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
}
