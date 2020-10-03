package SingletonPattern;

public class Singleton
{
    //保证线程的可见性
    private volatile static Singleton uniqueInstance;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(uniqueInstance==null)
        {
            //估计只有几个线程会进到这里
            synchronized (Singleton.class)
            {
                //这些线程逐个进来,但是只有第一个线程会进入到下面的if
                //其他的线程进来时,已经初始化完毕了,就不好初始化多个实例
                if(uniqueInstance==null)
                {
                    //第一个线程进来,初始化
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
