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
        Book bookObject = new Book();
        //execute
        int result = bookObject.numberRead();
        //Assert
        assertEquals(list, result);
    }

    //Given that I have an empty list, when I add the first book to my list then I expect numberRead to return 1.
    @Test
    public void addFirstBookTest(){
        //setup
        int list = 1;
        Book bookObject = new Book("The Hobbit", "J.R.R. Tolkein", 320, 1937);
        bookObject.addBook(bookObject, "January 1, 2020", 5);

        //execute
        int result = bookObject.numberRead();
        //Assert
        assertEquals(list, result);
    }

}