package com.company.responsibilitychain;

public class Main {

    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest();
        request.setHandler(LeaveHandler.createLeaveHandler());

        int days = (int) (Math.random() * 12) + 1;

        System.out.format("请求%d天的假期%n", days);
        request.requestLeave(days);
    }
}
