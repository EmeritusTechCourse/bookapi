package com.glc;

public class Book {
    public String title;
    public String author;
    public int length;
    public int year;
    public String dateRead;
    public int rating;

    Book(String title, String author, int length, int year){
        this.title = title;
        this.author = author;
        this.length = length;
        this.year = year;
        this.dateRead = null;
        this.rating = 0;
    }

    public String getTitle(){
        return this.title;
    }

    public void setDateRead(String date){
        this.dateRead = date;
    }

    public String getDateRead(){
        return this.dateRead;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public int getRating(){
        return this.rating;
    }

    public static String getRatingStars(int rating) {
        String stars = "";
        for (int i = 0; i < rating; i++) {
            stars += "*";
        }
        return stars;
    }

    @Override
    public String toString(){
        return String.format("%s by %s, %d pages, %d read on %s, %s", title, author, length, year, dateRead, getRatingStars(rating));
    }
    

}
