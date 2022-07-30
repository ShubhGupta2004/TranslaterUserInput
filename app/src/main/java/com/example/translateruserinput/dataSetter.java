package com.example.translateruserinput;

public class dataSetter {
    private final String name1;
    private final String name2;
    private final int img;

    public dataSetter(String name1, String name2,int img) {
        this.name1 = name1;
        this.name2 = name2;
        this.img=img;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public int getImg() {return img;}


}
