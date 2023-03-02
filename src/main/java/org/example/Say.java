package org.example;

import java.io.Serializable;

public class Say implements Serializable {

    private int id;


    private String author;

    private String content;

    public Say(int id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Say(String author, String content) {

        this.author = author;
        this.content = content;
    }

    public Say() {
    }
}
