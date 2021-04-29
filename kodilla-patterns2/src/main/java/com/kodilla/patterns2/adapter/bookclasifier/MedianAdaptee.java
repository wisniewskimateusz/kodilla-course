package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Bookb;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    Statistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Bookb> books) {
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Bookb> books) {
        return statistics.averagePublicationYear(books);
    }
}