package com.gmail.ahmadqorib97.pertemuan6;

public class Movie {
    int cover;
    private String title, genre, year, rating;
    public Movie(String title, String genre, String year, String rating, int cover) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.cover = cover;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String name) {
        this.title = name;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) { this.year = year; }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getRating() { return rating; }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public int getCover() { return cover; }
    public void setCover(int cover) { this.cover = cover; }
}
