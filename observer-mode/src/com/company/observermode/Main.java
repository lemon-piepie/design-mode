package com.company.observermode;

public class Main {

    public static void main(String[] args) {
	    //创建目标类
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
        //创建观察者
        ConcreteObserver observer = new ConcreteObserver();
        observer.setObserverName("普通的订阅者");
        //注册观察者
        weather.attach(observer);
        //目标类发布天气内容
        weather.setWeatherContent("晴转多云，最低温4摄氏度，最高温12摄氏度");
    }
}
