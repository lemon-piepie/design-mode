package com.company.observermode;

//具体观察者：订阅了天气服务的人
public class ConcreteObserver implements Observer {

    //观察者的姓名（订阅者）
    private String observerName;
    //订阅的天气内容
    private String weatherContent;

    @Override
    public void notify(WeatherSubject weatherSubject) {
        weatherContent = ((ConcreteWeatherSubject) weatherSubject).getWeatherContent();
        System.out.println(observerName + "您好，明天的天气为：" + weatherContent);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }
}
