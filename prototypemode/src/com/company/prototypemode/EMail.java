package com.company.prototypemode;

public class EMail implements Cloneable {
    private String target;
    private String content;
    private String sender;
    private String date;

    public EMail(String target, String content, String sender, String date) {
        System.out.println("开始发送邮件……");
        this.target = target;
        this.content = content;
        this.sender = sender;
        this.date = date;
        System.out.println("邮件发送成功！");
    }

    protected void setTarget(String target) {
        this.target = target;
    }

    protected void setContent(String content) {
        this.content = content;
    }

    protected void setSender(String sender) {
        this.sender = sender;
    }

    protected void setDate(String date) {
        this.date = date;
    }

    protected void send() {
        System.out.println("收件人：" + target + ",内容：" + content + ",发信人：" + sender + "邮件发送日期:" + date);
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("邮件复制成功！");
        return (EMail)super.clone();
    }
}
