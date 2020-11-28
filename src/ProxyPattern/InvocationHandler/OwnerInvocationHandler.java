package ProxyPattern.InvocationHandler;

import ProxyPattern.bean.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
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
                //不能自己对自己点赞..
                throw new IllegalAccessException("setHotOrNotRating");
            }
            else if (method.getName().startsWith("set")) {
                //可以设置自己的个人信息
                return method.invoke(person, args);
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
