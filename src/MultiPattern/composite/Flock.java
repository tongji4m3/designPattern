package MultiPattern.composite;

import MultiPattern.duck.Quackable;
import MultiPattern.observe.Observable;
import MultiPattern.observe.Observer;

import java.util.ArrayList;
import java.util.Iterator;

//组合需要和叶节点元素一样实现相同的接口
public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
            observable.notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
