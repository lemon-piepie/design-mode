package com.company.iteratormode;

//抽象聚合类：学校
public interface SchoolAggregate {
    public void add(Object obj);

    public void remove(Object obj);

    public Iterator getIterator();
}
