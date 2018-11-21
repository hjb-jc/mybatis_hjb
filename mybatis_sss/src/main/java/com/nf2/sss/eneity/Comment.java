package com.nf2.sss.eneity;

public class Comment {
    private int id;
    private String body;

    private Author author;  //评价是由谁写的
    private Blog blog;   //评价属于这个博客

    public Comment() {
    }

    public Comment(int id,String body){
        this.id = id;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", author=" + author +
                ", blog=" + blog +
                '}';
    }
}
