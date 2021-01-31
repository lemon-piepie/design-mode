package com.company.proxymode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.RentApartment();
        System.out.println("******************************");

        final Landlord landlord = new Landlord();
        Rent rentAgency = (Rent) Proxy.newProxyInstance(landlord.getClass().getClassLoader(), landlord.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("房屋中介发布房源信息");
                Object object = method.invoke(landlord, args);
                System.out.println("收取中介费");
                return object;
            }
        });
        rentAgency.RentApartment();
    }
}
