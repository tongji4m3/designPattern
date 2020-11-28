package ProxyPattern.InvocationHandler;

import ProxyPattern.bean.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try
        {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }
            else if (method.getName().equals("setHotOrNotRating")) {
                //可以对那个人进行点赞
                return method.invoke(person, args);
            }
            else if (method.getName().startsWith("set")) {
                //不允许设置那个人的信息
                throw new IllegalAccessException("其他人不能调用那个人的set");
            }
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        //调用其他方法则不管
        return null;
    }
}
