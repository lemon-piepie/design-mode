package com.company.iteratormode;

import java.util.ArrayList;
import java.util.List;

//具体迭代器：完成对聚合对象的遍历，记录遍历的当前位置
public class ConcreteIterator implements Iterator {

    private List<Object> list = new ArrayList<>();
    private int index;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }
}
