package com.example.root.fragmentmvvm.Main.Dao;

/**
 * Created by root on 06/10/16.
 */

public class MyAppDao {
    String title, img;

    public MyAppDao(String title, String img) {
        this.title = title;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
