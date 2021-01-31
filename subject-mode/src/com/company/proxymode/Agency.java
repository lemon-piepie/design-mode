package com.company.proxymode;

//代理类：房屋中介，代理房东进行房子出租的业务
public class Agency implements Rent {
    private Landlord landlord;

    @Override
    public void RentApartment() {
        if (landlord == null){
            landlord = new Landlord();
        }
        preRent();
        landlord.RentApartment();
        afterRent();
    }

    private void preRent(){
        System.out.println("房屋中介发布房源信息");
    }

    private void afterRent(){
        System.out.println("收取中介费");
    }
}
