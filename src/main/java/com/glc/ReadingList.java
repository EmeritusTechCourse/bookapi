package com.glc;

import java.util.ArrayList;
import java.util.List;

public class ReadingList {
    public List<Book> bookList;
    public int numberRead;

    public ReadingList(){
        this.bookList = new ArrayList<>();
        this.numberRead = 0;
    }
    
    public void addBook(Book obj, String dateRead, int rating){
        obj.setDateRead(dateRead);
        obj.setRating(rating);
        this.bookList.add(obj);
        numberRead++;
    }
    
    public List<Book> getBooks() {
        return bookList;
    }

    public void removeBook(String title){
        for (int index = 0; index < bookList.size(); index++) {
            Book elememt = bookList.get(index);

            if(elememt.getTitle().equals(title)){
                this.bookList.remove(index);
                break;
            }     
        }
        numberRead--;
    }



    public int numberRead(){
        return numberRead;
    }

    public List<Book> getBooksByRating(int rating) {
        List<Book> tempList = new ArrayList<Book>();

        for (int index = 0; index < bookList.size(); index++) {
            int firstElement = bookList.get(index).getRating();

            if(firstElement == rating){
                tempList.add(bookList.get(index));
            }
        }
        return tempList;
    }


}
