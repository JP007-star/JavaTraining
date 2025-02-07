package org.example.stub;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StubTest {

    @Test
    void demoStub(){
        BookRepository bookRepository=new BookRepositoryStub();
        BookService bookService=new BookService(bookRepository);

        List<Book> newBookWithAppliedDiscount=bookService.getBooksWithAppliedDiscount(10,7);

        assertEquals(3,newBookWithAppliedDiscount.size());
        assertEquals(450,newBookWithAppliedDiscount.get(0).getPrice());
    }
}
