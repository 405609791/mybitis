package org.codefarmer.mybatismoredate.pojo;

import javax.xml.crypto.Data;

public class Book {
    private int id;
    private String cover;
    private String title;
    private String author;
    private String press;
    private Data time;
    private String abs;
    private int cid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Data getTime() {
        return time;
    }

    public void setTime(Data time) {
        this.time = time;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
