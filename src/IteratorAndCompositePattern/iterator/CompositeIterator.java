package IteratorAndCompositePattern.iterator;

import IteratorAndCompositePattern.menu.Menu;
import IteratorAndCompositePattern.menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

//遍历组件内的菜单项,而且保证所有的子菜单都包括进来
//主要使用到了递归
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    //传入遍历的最顶层的迭代器
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        else{
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }
            else{
                return true;
            }
        }

    }

    @Override
    public Object next() {
        if (hasNext()) {
            //取出当前迭代器
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
