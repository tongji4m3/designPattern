package ObserverPattern.subject;

import ObserverPattern.observer.Observer;

public interface Subject
{
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
