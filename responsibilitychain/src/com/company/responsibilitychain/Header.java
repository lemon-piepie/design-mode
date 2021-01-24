package com.company.responsibilitychain;

public class Header extends LeaveHandler {

    private final String name = "主管";

    @Override
    public void processLeave(int days) {
        if (days <= 10) {
            System.out.format("%s批准了%d天的请假", this.name, days);
        } else {
            System.out.format("%s拒绝了%d天的请假", this.name, days);
        }
    }
}
