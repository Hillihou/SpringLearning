package com.iweb.collection;

import java.util.List;

public class book {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "book{" +
                "list=" + list +
                '}';
    }
}
