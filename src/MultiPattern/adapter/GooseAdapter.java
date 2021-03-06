package MultiPattern.adapter;

import MultiPattern.duck.Quackable;
import MultiPattern.observe.Observable;
import MultiPattern.observe.Observer;

//适配器会实现目标接口
public class GooseAdapter implements Quackable {
    Observable observable;
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
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
