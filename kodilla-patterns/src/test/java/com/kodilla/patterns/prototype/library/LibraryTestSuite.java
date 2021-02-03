package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Book book1 = new Book("Book 1", "Author 1", LocalDate.of(2017, 1, 13));
        Book book2 = new Book("Book 2", "Author 2", LocalDate.of(1977, 11, 2));
        Book book3 = new Book("Book 3", "Author 3", LocalDate.of(1987, 8, 30));
        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //When
        //Shallow clone of board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        //removing elements
        library.getBooks().remove(book3);

        //Then
        System.out.println(library.getName());
        System.out.println(library.getBooks().size());
        System.out.println(clonedLibrary.getName());
        System.out.println(clonedLibrary.getBooks().size());
        System.out.println(deepClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getBooks().size());

        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}