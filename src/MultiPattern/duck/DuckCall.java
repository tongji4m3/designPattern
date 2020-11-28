package MultiPattern.duck;

import MultiPattern.observe.Observable;
import MultiPattern.observe.Observer;

public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kuack");
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
