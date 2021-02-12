package com.company.observermode;

//具体主题角色
public class ConcreteWeatherSubject extends WeatherSubject{

    //获取天气的具体内容
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        //获取到天气的内容后，通知所有订阅者
        this.notifyObservers();
    }
}
