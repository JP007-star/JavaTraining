package org.example.spy;

import org.example.stub.BookRepository;
import org.example.stub.BookRepositoryStub;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SpyTest {


    @Test
    void demoSpy(){
        BookRepositorySpy bookRepository=new BookRepositorySpy();
        BookService bookService=new BookService(bookRepository);

        bookService.addBook(new Book("1","book1",100, LocalDate.now()));
        assertEquals(0,bookRepository.timesCalled());

        bookService.addBook(new Book("2","book3",500, LocalDate.now()));
        bookService.addBook(new Book("3","book4",100, LocalDate.now()));

        Book bookSpy=new Book("3","book4",500, LocalDate.now());
        assertEquals(1,bookRepository.timesCalled());
//        assertFalse(bookRepository.calledWith(bookSpy));
    }
}
