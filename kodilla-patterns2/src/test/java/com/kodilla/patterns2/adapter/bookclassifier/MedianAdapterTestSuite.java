package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("J.K. Rowling", "Harry Potter and the Philosopher’s Stone", 1997, "HPatPS");
        Book book2 = new Book("J.K. Rowling", "Harry Potter and the Chamber of Secrets", 1998, "HPatCoS");
        Book book3 = new Book("George R.R. Martin", "A Game of Thrones", 1996, "AGoT");
        Set<Book> bookSet = new HashSet();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1997, median);
    }
}