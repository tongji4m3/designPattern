package MultiPattern;

import AdapterPattern.animal.Duck;
import MultiPattern.adapter.Goose;
import MultiPattern.adapter.GooseAdapter;
import MultiPattern.composite.Flock;
import MultiPattern.decorator.QuackCounter;
import MultiPattern.duck.*;
import MultiPattern.factory.AbstractDuckFactory;
import MultiPattern.factory.CountingDuckFactory;
import MultiPattern.observe.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulator(duckFactory);
    }

    private void simulator(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = new MallardDuck();

        simulator(mallardDuck);

        //适配器
        System.out.println("--------------适配器------------");
        Quackable gooseAdapter = new GooseAdapter(new Goose());
        simulator(gooseAdapter);

        //装饰者
        System.out.println("--------------装饰者------------");
        Quackable duckCallDecorator = new QuackCounter(new DuckCall());
        simulator(duckCallDecorator);
        Quackable rubberDuckDecorator = new QuackCounter(new RubberDuck());
        simulator(rubberDuckDecorator);
        System.out.println("quacked " + QuackCounter.getQuacks() + " times");

        //抽象工厂
        System.out.println("--------------抽象工厂------------");
        Quackable readHeadDuck = duckFactory.createRedheadDuck();
        simulator(readHeadDuck);
        System.out.println("quacked " + QuackCounter.getQuacks() + " times");

        //迭代器与组合模式
        System.out.println("--------------迭代器与组合模式------------");
        Flock flockDucks = new Flock();
        flockDucks.add(readHeadDuck);
        flockDucks.add(rubberDuckDecorator);

        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();

        Flock flockMallardDucks = new Flock();
        flockMallardDucks.add(mallardDuck1);
        flockMallardDucks.add(mallardDuck2);
        flockMallardDucks.add(mallardDuck3);
        flockMallardDucks.add(mallardDuck4);

        flockDucks.add(flockMallardDucks);

        simulator(flockDucks);

        //观察者模式

        System.out.println("--------------观察者模式------------");
        Quackologist quackologist = new Quackologist();
        flockDucks.registerObserver(quackologist);
        simulator(flockDucks);
    }

    private void simulator(Quackable duck) {
        duck.quack();
    }
}
