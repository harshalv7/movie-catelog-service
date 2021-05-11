package com.example.javabrains.moviecatelogservice.modules;

public class CatelogItems {

    private String title;
    private String desc;
    private String rating;
    public CatelogItems(String title, String desc, String rating) {
        this.title = title;
        this.desc = desc;
        this.rating = rating;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "CatelogItems{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", rating=" + rating +
                '}';
    }




}
