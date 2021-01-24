package com.company.responsibilitychain;

public abstract class LeaveHandler {

    //后继接口
    protected LeaveHandler successor;

    public static LeaveHandler createLeaveHandler() {
        LeaveHandler staff = new Staff();
        LeaveHandler manager = new Manager();
        LeaveHandler header = new Header();

        staff.setSuccessor(manager);
        manager.setSuccessor(header);

        return staff;
    }

    public void setSuccessor(LeaveHandler leaveHandler){
        this.successor = leaveHandler;
    }

    public abstract void processLeave(int days);
}
