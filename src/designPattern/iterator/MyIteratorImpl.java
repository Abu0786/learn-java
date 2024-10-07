package designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> list;
    public MyIteratorImpl(List<User> list) {
        this.list = list;
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
