package com.company.prototypemode;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        EMail advertisement = new EMail("会员", "1周年大酬宾", "XXX饭店", "2021年1月1日");
        advertisement.send();
        EMail notice = (EMail) advertisement.clone();
        notice.setContent("积分上涨通知");
        notice.setDate("2021年1月4日");
        notice.send();
    }
}
