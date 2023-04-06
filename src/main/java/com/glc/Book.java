package com.glc;
import java.util.ArrayList;

public class Book {
    
    public String title;
    public String author;
    public int length;
    public int year;
    public ArrayList<String> bookList = new ArrayList<String>();

    Book(){
    }

    Book(String title, String author, int length, int year){
        this.title = title;
        this.author = author;
        this.length = length;
        this.year = year;
    }

    public void addBook(Book obj, String dateRead, int rating){
        //int length = bookList.length;

        String ratingStar = "";
        for (int i = 0; i < rating-1; i++) {
            ratingStar += "*"; 
        }
        bookList.add(obj.title + "by" + obj.author +"," + obj.length + "pages," + "read on" + dateRead + " "+ ratingStar) ;

    }




    public int numberRead(){
        return bookList.size();
    }

}
