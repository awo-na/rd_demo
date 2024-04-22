package org.example;

public class Demo {

    private String hoge;

    public void setHoge(String hoge) {
        this.hoge = hoge;
    }

    public String getHoge() {
        return hoge;
    }

    public boolean bugPattern(String arg) {
        String fuga = null;
        return fuga.equals(arg);
    }

}
