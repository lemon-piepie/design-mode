package com.company.commandmode;

import javax.swing.*;

//实现者，接收者
public class Chief {

    public Chief(){
        System.out.println("厨师接收到点菜信息");
    }

    public void Cook() {
        System.out.println("厨师正在根据点餐进行烹饪……");
    }
}
