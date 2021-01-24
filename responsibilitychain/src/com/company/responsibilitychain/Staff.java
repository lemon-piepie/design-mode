package com.company.responsibilitychain;

public class Staff extends LeaveHandler {

    private final String name = "职员";

    @Override
    public void processLeave(int days) {
        if (days <= 3) {
            System.out.format("%s可以直接通过%d天的假期", this.name, days);
        } else {
            successor.processLeave(days);
        }
    }
}
