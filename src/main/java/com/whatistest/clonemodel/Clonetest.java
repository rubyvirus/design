package com.whatistest.clonemodel;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/2.
 */
public class Clonetest implements Cloneable {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Clonetest clone() {
        Object obj = null;
        try {
            return (Clonetest) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("clone not supported");
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Clonetest clonetest = new Clonetest();
        clonetest.setId("1234");
        Clonetest clonetest1 = clonetest.clone();
        System.out.println(clonetest.getId());
        System.out.println(clonetest1.getId());
    }
}
