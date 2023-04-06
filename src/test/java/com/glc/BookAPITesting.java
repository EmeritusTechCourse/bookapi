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


}
