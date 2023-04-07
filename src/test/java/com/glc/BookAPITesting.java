package com.glc;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.*;

public class BookAPITesting {

    //Given that I visit the site, when I first start, I expect my list to be empty.
    @Test
    public void emptyListTest(){
        //setup
        int list = 0;
        ReadingList readingObject = new ReadingList();
        //execute
        int result = readingObject.numberRead();
        //Assert
        assertEquals(list, result);
    }

    //Given that I have an empty list, when I add the first book to my list then I expect numberRead to return 1.
    @Test
    public void addFirstBookTest(){
        //setup
        int list = 1;
        Book bookObject = new Book("The Hobbit", "J.R.R. Tolkein", 320, 1937);
        ReadingList readingObject = new ReadingList();

        readingObject.addBook(bookObject, "January 1, 2020", 5);

        //execute
        int result = readingObject.numberRead();
        //Assert
        assertEquals(list, result);
    }

    //Given that I have an empty list, when I add additional books to the list I expect the numberRead to return the total number of books in my list.
    @Test
    public void addAdditionalBookTest(){
        //setup
        int list = 4;
        Book bookObject1 = new Book("The Hobbit", "J.R.R. Tolkein", 320, 1937);
        Book bookObject2 = new Book("The History", "Ozaib", 320, 1937);
        Book bookObject3 = new Book("The Math", "Hunaid. Tolkein", 320, 1937);
        Book bookObject4 = new Book("The Science", "Eienstien. Tolkein", 320, 1937);
        ReadingList readingObject = new ReadingList();

        readingObject.addBook(bookObject1, "January 1, 2020", 5);
        readingObject.addBook(bookObject2, "January 2, 2020", 4);
        readingObject.addBook(bookObject3, "January 3, 2020", 4);
        readingObject.addBook(bookObject4, "January 4, 2020", 3);

        //execute
        int result = readingObject.numberRead();
        //Assert
        assertEquals(list, result);
    }

    



}