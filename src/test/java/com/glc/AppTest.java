package com.glc;

import static org.junit.jupiter.api.Assertions.*;
// import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    //Written by Huzaifa
    @Test
    public void getBookTest(){
        //setup
        // ReadingList book = new ReadingList();
        //execute
        ArrayList <String> books = ReadingList.getBook();
        //assert
        assertEquals(null, books);
    }

    //Written by Huzaifa
    @Test
    public void readBookFirstTest(){
        //setup
        ReadingList readBook = new ReadingList("Justujo k safr", "Zeeshan Ul Hssan Usmani", 345, 2021,"read on march 2, 2023", 5);
        // execute
        int numberRead = readBook.addBook();
        //assert
        assertEquals(1, numberRead);
    }

    @Test
    public void readAdditionalBookTest(){
        //setup
        ReadingList readBook = new ReadingList("Justujo k safr", "Zeeshan Ul Hssan Usmani", 345, 2021,"read on march 2, 2023", 5);
        // ReadingList readBook1 = new ReadingList("System Analyst kesy bany", "Zeeshan Ul Hssan Usmani", 345, 2021,"read on march 2, 2023", 5);
        
        //execute
        int numberRead = readBook.addBook();

        //assert
        assertEquals(2, numberRead);
    }

    
}
