package com.glc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getBookTest(){
        //setup
        List <String> list = ReadingList.bookList;
        list.clear();
        //execute
        List <String> books = ReadingList.getBook();
        //assert
        assertEquals(null, books);
    }

    @Test
    public void readBookFirstTest(){
        //setup
        List <String> list = ReadingList.bookList;
        list.clear();
        Book book = new Book("System Analyst kesy bany", "Zeeshan Ul Hssan Usmani", 345, 2021);
        ReadingList.addBook(book, "read on march 2, 2023", 5);
        // execute
        int numberRead = ReadingList.numberRead();
        //assert
        assertEquals(1, numberRead);
    }

    @Test
    public void readAdditionalBookTest(){
        //setup
        List <String> list = ReadingList.bookList;
        list.clear();
        Book book = new Book("Justujo k safr", "Zeeshan Ul Hssan Usmani", 345, 2021);
        Book book1 = new Book("System Analyst kesy bany", "Zeeshan Ul Hssan Usmani", 345, 2021);
        ReadingList.addBook(book,"read on march 2, 2023", 5);
        ReadingList.addBook(book1, "read on march 2, 2023", 5);


        int numberRead = ReadingList.numberRead();

        //assert
        assertEquals(2, numberRead);
    }

    @Test
    public void removeBookTest(){
        //setup
        List <String> list = ReadingList.bookList;
        list.clear();
        Book book = new Book("Justujo k safr", "Zeeshan Ul Hssan Usmani", 345, 2021);
        Book book1 = new Book("System Analyst kesy bany", "Zeeshan Ul Hssan Usmani", 345, 2021);
        ReadingList.addBook(book,"read on march 2, 2023", 5);
        ReadingList.addBook(book1, "read on march 2, 2023", 5);
        String title = "Justujo k safr";
        //execute
        ReadingList.removeBook(title);
        List<String> books = ReadingList.getBook();
        //assert
        List<String> arr = new ArrayList<>();
        arr.add("System Analyst kesy bany by Zeeshan Ul Hssan Usmani, 345 pages, 2021, read on march 2, 2023, 5");
        assertEquals(arr, books);
    }

    @Test
    public void getBooksTest(){
        //setup
        List <String> list = ReadingList.bookList;
        list.clear();
        Book book1 = new Book("System Analyst kesy bany", "Zeeshan Ul Hssan Usmani", 345, 2021);
        ReadingList.addBook(book1,"read on march 2, 2023", 5);
        //execute
        List <String> books = ReadingList.getBook();
        //assert
        List<String> arr = new ArrayList<>();
        arr.add("System Analyst kesy bany by Zeeshan Ul Hssan Usmani, 345 pages, 2021, read on march 2, 2023, 5");
        assertEquals(arr, books);
    }

    @Test
    public void getRatingBooksTest(){
        //setup
        List <String> list = ReadingList.bookList;
        list.clear();
        Book book1 = new Book("System Analyst kesy bany", "Zeeshan Ul Hssan Usmani", 345, 2021);
        ReadingList.addBook(book1,"read on march 2, 2023", 5);
        //execute
        List <String> books = ReadingList.getBooksByRating();
        //assert
        List<String> arr = new ArrayList<>();
        arr.add("System Analyst kesy bany by Zeeshan Ul Hssan Usmani, 345 pages, 2021, read on march 2, 2023, 5");
        assertEquals(arr, books);
    }
}
