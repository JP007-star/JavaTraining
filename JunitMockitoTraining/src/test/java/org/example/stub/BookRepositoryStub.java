package org.example.stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryStub implements BookRepository {

    @Override
    public List<Book> findNewBooks(int days) {
        List<Book> newBooks=new ArrayList<>();
        newBooks.add(new Book("12","Title",500, LocalDate.now()));
        newBooks.add(new Book("134","Title1",400, LocalDate.now()));
        newBooks.add(new Book("124","Title3",400, LocalDate.now()));
        return newBooks;
    }
}
