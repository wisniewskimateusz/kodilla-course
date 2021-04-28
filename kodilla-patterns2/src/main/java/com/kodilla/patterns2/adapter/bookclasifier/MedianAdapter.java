package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Bookb;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, Bookb> bookMap =
                new HashMap<>();
        bookSet.stream().forEach(book -> {
            bookMap.put(new BookSignature(book.getSignature()),
                    new Bookb(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        });
        return medianPublicationYear(bookMap);
    }
}