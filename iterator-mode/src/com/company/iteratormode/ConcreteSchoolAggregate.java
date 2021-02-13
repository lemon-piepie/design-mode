package com.company.iteratormode;

import java.util.ArrayList;
import java.util.List;

//具体聚合类，返回一个具体迭代器的实例
public class ConcreteSchoolAggregate implements SchoolAggregate{

    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
