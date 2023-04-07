package com.glc;

import java.util.ArrayList;

public class ReadingList {

    public ArrayList<String> bookList = new ArrayList<String>();

    public void addBook(Book obj, String dateRead, int rating){
        //int length = bookList.length;

        String ratingStar = "";
        for (int i = 0; i < rating; i++) {
            ratingStar += "*"; 
        }
        bookList.add(obj.title + "by" + obj.author +"," + obj.length + "pages," + "read on" + dateRead + " "+ ratingStar) ;

    }

    public void removeBook(String title){        
        for (int index = 0; index < bookList.size(); index++) {
            String firstElement = bookList.get(index);

            if(firstElement.contains(title)){
                bookList.remove(index);
                break;
            }
        }
    }



    public int numberRead(){
        return bookList.size();
    }

    public ArrayList<String> getBooks() {
        return bookList;
    }

}
