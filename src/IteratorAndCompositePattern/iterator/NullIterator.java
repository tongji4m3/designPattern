package IteratorAndCompositePattern.iterator;

import java.util.Iterator;

//空迭代器
public class NullIterator implements Iterator {
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
