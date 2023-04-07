package com.glc;

import java.util.ArrayList;
import java.util.List;

//Written by Huzaifa
public class ReadingList extends Book {
    String dateRead;
    int rating;
    static List<String> bookList = new ArrayList<>();

    ReadingList(String title, String author, int length, int year, String dateRead, int rating) {
        super(title, author, length, year);
        this.dateRead = dateRead;
        this.rating = rating;
    }
    public static List <String> getBook(){
            // if(bookList.size() == 0){
            //     return null;
            // }
            return bookList;

    }
    public int addBook(){
        bookList.add(title+" "+ author + ", " + length + " pages, " + year + ", " + dateRead +", "+ rating);
        return bookList.size();
    }

    public static String removeBook(String title){
        // for (String i : bookList) {
        //     if(i.contains(title)){
        //         bookList.remove(i);
        //     }
        // }
            // bookList.remove(title);
            return bookList.get(1);
    }
}