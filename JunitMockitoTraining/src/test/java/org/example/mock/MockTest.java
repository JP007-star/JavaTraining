package org.example.mock;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockTest {


    @Test
    void demoMock(){
        BookRepositoryMock bookRepository=new BookRepositoryMock();
        BookService bookService=new BookService(bookRepository);

        bookService.addBook(new Book("1","book1",100, LocalDate.now()));
        bookService.addBook(new Book("2","book3",500, LocalDate.now()));
        bookService.addBook(new Book("3","book4",100, LocalDate.now()));

        Book bookSpy=new Book("3","book4",500, LocalDate.now());

        bookService.addBook(bookSpy);

        bookRepository.verify(bookSpy,4);

    }
}
