package com.whatistest.clonemodel;

import java.io.*;

/**
 * 深度复制，利用序列化输入输出流，实现对象复制
 * Created by rubyvirusqq@gmail.com on 2017/3/2.
 */
public class WeekLog implements Serializable {
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WeekLog deepClone() throws IOException, ClassNotFoundException {

        // 将数据写入到流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        // 返回数据
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (WeekLog) objectInputStream.readObject();

    }

    @Override
    public String toString() {
        return "WeekLog{" +
                "attachment=" + attachment +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public static void main(String[] args) {
        WeekLog weekLog_previous, weekLog_new;
        Attachment attachment = new Attachment();
        attachment.setName("我是李川的附件");
        weekLog_previous = new WeekLog();
        weekLog_previous.setName("李川");
        weekLog_previous.setDate("2017-3-3");
        weekLog_previous.setContent("我是李川，你是谁啊");
        weekLog_previous.setAttachment(attachment);

        try {

            weekLog_new = weekLog_previous.deepClone();

            if (weekLog_new == weekLog_previous) System.out.println("我们两个相等，你们知道吗！");
            System.out.println("============================================");
            System.out.println(weekLog_previous.toString());
            System.out.println("============================================");
            System.out.println(weekLog_new.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
