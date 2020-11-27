package IteratorAndCompositePattern.menu;

import java.util.Iterator;

//菜单组件
//对每个方法都提供了默认的实现,即抛出异常
public abstract class MenuComponent {
    //增加/删除/获取菜单组件
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //被菜单项使用的方法

    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }

    //迭代器相关操作
    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
