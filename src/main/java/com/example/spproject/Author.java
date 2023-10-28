package com.example.spproject;

import lombok.Getter;

@Getter
public class Author {
    public String name;

    public Author(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Author: " + name);
    }
}
