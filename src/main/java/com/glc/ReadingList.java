package com.glc;

import java.util.ArrayList;
import java.util.List;

public class ReadingList{
    Book book;
    String dateRead;
    int rating;
    public static List<String> bookList = new ArrayList<>();

    public static List <String> getBook(){
            if(bookList.size() == 0){
                return null;
            }
            return bookList;

    }
    public static  void addBook(Book book, String dateRead, int rating){
        bookList.add(book.title+" by "+ book.author + ", " + book.length + " pages, " + book.year + ", " + dateRead +", "+ rating);
    }

    public static int numberRead(){
        return bookList.size();
    }
    public static void removeBook(String title){
        for (String i : bookList) {
            if(i.contains(title)){
                bookList.remove(i);
            }
        }
    }

    public static List <String> getBooksByRating(){
        if(bookList.size() == 0){
            return null;
        }
        return bookList;
    }
}