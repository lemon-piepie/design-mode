package com.company.responsibilitychain;

public class LeaveRequest {

    private LeaveHandler handler;


    public void setHandler(LeaveHandler handler) {
        this.handler = handler;
    }

    public void requestLeave(int days) {
        handler.processLeave(days);
    }
}
