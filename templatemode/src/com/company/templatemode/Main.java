package com.company.templatemode;

public class Main {

    public static void main(String[] args) {
        System.out.println("又是新的一天，今天是星期日");
        DailyAffair sunday = new Sunday();
        sunday.prepareDailyAffairTemplate();
        System.out.println("一天过去了……");

        System.out.println("***************************");

        System.out.println("又是新的一天，今天是星期一");
        DailyAffair monday = new Monday();
        monday.prepareDailyAffairTemplate();
        System.out.println("一天过去了……");

    }
}
