package org.example.fake;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeTest {


    @Test
    public void fakeTest(){
        BookRepository fakeBookRepository=new FakeBookRepository();
        BookService bookService=new BookService(fakeBookRepository);

        bookService.addBook(new Book("1","book1",100, LocalDate.now()));
        bookService.addBook(new Book("2","book3",100, LocalDate.now()));
        bookService.addBook(new Book("3","book4",100, LocalDate.now()));

        assertEquals(3,bookService.findNumberOfBook());
    }
}
