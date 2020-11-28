package MultiPattern.observe;

//任何想要被观测的Quackable都必须实现该接口
public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
