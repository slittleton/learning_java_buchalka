package com.company;

public class Song {
    private String title;
    private double duration;

    public Song(String songTitle, double duration) {
        this.title = songTitle;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.title + " : " + this.duration;
    }
}
