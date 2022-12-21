package com.naumowets.app;

public class Good {
    int id;
    String title;
    int cost;

    public Good(int id, String title, int cost){
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.id + " " + title + " " + cost;
    }

}
