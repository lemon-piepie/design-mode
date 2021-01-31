package com.company.proxymode;

//具体主题类：房东，实现租房子的业务
public class Landlord implements Rent {
    @Override
    public void RentApartment() {
        System.out.println("签署房屋租赁协议");
    }
}
