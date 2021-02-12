package com.company.observermode;

import java.util.ArrayList;
import java.util.List;

//抽象目标类：天气
public class WeatherSubject {

    //用来保存注册的观察者对象：订阅着列表
    private List<Observer> observers = new ArrayList<Observer>();

    //把订阅了天气服务的人添加到订阅者列表中
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //删除订阅者列表中的某一个人
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.notify(this);
        }
    }
}
