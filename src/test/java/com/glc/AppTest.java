package com.glc;

import static org.junit.jupiter.api.Assertions.*;
// import static org.junit.jupiter.api.Assertions.assertEquals;

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
        ReadingList book = new ReadingList();
        //execute
        Book books = book.getBook();
        //assert
        assertEquals(null, books);
    }
}
