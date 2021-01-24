package com.company.responsibilitychain;

public class Manager extends LeaveHandler {

    private final String name = "经理";

    @Override
    public void processLeave(int days) {
        if (days <= 5) {
            System.out.format("%s批准了%d天的请假", this.name, days);
        } else {
            successor.processLeave(days);
        }
    }
}
