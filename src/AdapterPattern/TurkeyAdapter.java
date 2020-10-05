package AdapterPattern;

import AdapterPattern.animal.Duck;
import AdapterPattern.animal.Turkey;

//将火鸡适配成鸭子
public class TurkeyAdapter implements Duck
{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey)
    {
        this.turkey = turkey;
    }

    @Override
    public void quack()
    {
        turkey.gobble();
    }

    @Override
    public void fly()
    {
        for (int i = 0; i < 5; i++)
        {
            turkey.fly();
        }
    }
}
