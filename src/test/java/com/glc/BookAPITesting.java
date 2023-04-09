package com.glc;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

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
        Book bookObject3 =  new Book("The Hobbit", "J.R.R. Tolkein", 320, 1937);
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

    // //Given that I have a book in my list, when I call removeBook("<title>") with "title" representing the title of my book that I want to delete, then when I call getBooks() the book I deleted should no longer be there.
    @Test
    public void removeBookTest(){
        //setup
        String title = "The History";
        int length = 2;
        
        Book bookObject1 = new Book("The Hobbit", "J.R.R. Tolkein", 320, 1937);
        Book bookObject2 = new Book("The History", "Ozaib", 320, 1937);
        Book bookObject4 = new Book("The Science", "Eienstien. Tolkein", 320, 1937);
        
        ReadingList readingObject = new ReadingList();

        readingObject.addBook(bookObject1, "January 1, 2020", 5);
        readingObject.addBook(bookObject2, "January 2, 2020", 4);
        readingObject.addBook(bookObject4, "January 4, 2020", 3);
      
        //execute
        readingObject.removeBook(title);
        System.out.println(readingObject.getBooks());
        
        int result = readingObject.numberRead();

        String[] expectedBooks = {
            "The Hobbit by J.R.R. Tolkein, 320 pages, 1937 read on January 1, 2020, *****",
            "The Science by Eienstien. Tolkein, 320 pages, 1937 read on January 4, 2020, ***"
        };

        //Assert
        assertEquals(length, result);
        assertEquals(expectedBooks[0], readingObject.getBooks().get(0).toString());
        assertEquals(expectedBooks[1], readingObject.getBooks().get(1).toString());
    }

    // //Given that I have an empty list, when I add a new book I expect getBooks() to return a list of books that includes the book I added.
    @Test
    public void returnListWithSameBookTest(){
        //setup
        ReadingList readingObject = new ReadingList();
        String entry = "The Hobbit by J.R.R. Tolkein, 320 pages, 1937 read on January 1, 2020, *****";

        //execute
        Book bookObject1 = new Book("The Hobbit", "J.R.R. Tolkein", 320, 1937);

        readingObject.addBook(bookObject1, "January 1, 2020", 5);
        List<Book> result = readingObject.getBooks();

        //Assert
        assertEquals(entry, result.get(0).toString());
    }

    // //Given when I call getBooksByRating(), I should return a list of books that all have that rating.
    @Test
    public void returnBooksByRatingTest(){
        //setup
        int rating = 5;
        String[] expectedBooks = {
            "The Hobbit by J.R.R. Tolkein, 320 pages, 1937 read on January 1, 2020, *****",
            "The Math by Hunaid. Tolkein, 320 pages, 1937 read on January 3, 2020, *****"
        };

        //execute
        Book bookObject1 = new Book("The Hobbit", "J.R.R. Tolkein", 320, 1937);
        Book bookObject2 = new Book("The History", "Ozaib", 320, 1937);
        Book bookObject3 = new Book("The Math", "Hunaid. Tolkein", 320, 1937);
        
        ReadingList readingObject = new ReadingList();

        readingObject.addBook(bookObject1, "January 1, 2020", 5);
        readingObject.addBook(bookObject2, "January 2, 2020", 4);
        readingObject.addBook(bookObject3, "January 3, 2020", 5);

        List<Book> result = readingObject.getBooksByRating(rating);
        System.out.println(result);

        //Assert
        assertEquals(expectedBooks[0], result.get(0).toString());
        assertEquals(expectedBooks[1], result.get(1).toString());
    }


}