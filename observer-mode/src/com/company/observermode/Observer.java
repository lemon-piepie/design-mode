package com.company.observermode;

//抽象观察者
public interface Observer {
    public void notify(WeatherSubject weatherSubject);
}
