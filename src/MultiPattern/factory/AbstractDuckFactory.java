package MultiPattern.factory;

import MultiPattern.duck.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();
}
