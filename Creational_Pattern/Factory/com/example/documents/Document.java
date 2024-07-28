package com.example.documents;

public interface Document {
    void open();
    void close();
    void save();
    void setContent(String content);
    String getContent();
}
