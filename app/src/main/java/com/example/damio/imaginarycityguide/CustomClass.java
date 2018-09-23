package com.example.damio.imaginarycityguide;

public class CustomClass {

    private int picture;
    private String content;

    public CustomClass (String mcontent, int mpicture){
        picture = mpicture;
        content = mcontent;
    }

    public String getContent() {
        return content;
    }

    public int getPicture() {
        return picture;
    }
}
