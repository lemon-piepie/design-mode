package com.company.commandmode;

//具体命令类，实现execute方法，执行操作
public class CookSoupCommand implements Command{
    private final Chief chief = new Chief();

    @Override
    public void execute() {
        chief.Cook();
        System.out.println("正在制作汤");
    }
}
