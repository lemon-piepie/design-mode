package com.company.iteratormode;

//抽象迭代器：有hasNext()、first()、next()等方法
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}
