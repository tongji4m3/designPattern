package ProxyPattern;

import ProxyPattern.InvocationHandler.NonOwnerInvocationHandler;
import ProxyPattern.InvocationHandler.OwnerInvocationHandler;
import ProxyPattern.bean.PersonBean;
import ProxyPattern.bean.PersonBeanImpl;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    public static void main(String[] args) {
        MatchMakingTestDrive testDrive = new MatchMakingTestDrive();
        testDrive.drive();
    }

    //需要一个PersonBean作为参数,并且返回他的代理,因为代理和主题有相同的接口,所以返回PersonBean
    //需要被代理的对象有父接口
    PersonBean getOwnerProxy(PersonBean personBean) {
        //创建一个代理,并且将他的方法调用转发给了OwnerInvocationHandler
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }
    PersonBean getNonOwnerProxy(PersonBean personBean) {
        //创建一个代理,并且将他的方法调用转发给了NonOwnerInvocationHandler
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }



    private void drive() {
        PersonBean joe = new PersonBeanImpl();
        PersonBean ownerProxy = getOwnerProxy(joe);
        ownerProxy.setName("joe");
        System.out.println(ownerProxy.getName());
//        ownerProxy.setHotOrNotRating(1);
//        Caused by: java.lang.IllegalAccessException: setHotOrNotRating
//        通过动态代理,实现了权限控制

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println(nonOwnerProxy.getHotOrNotRating());
//        nonOwnerProxy.setName("ABC");
//        Caused by: java.lang.IllegalAccessException: 其他人不能调用那个人的set
    }
}
