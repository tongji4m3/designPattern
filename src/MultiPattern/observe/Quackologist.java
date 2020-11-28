package MultiPattern.observe;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println(duck + " just quacked");
    }
}
