package org.example.spy;

public class BookService {

    BookRepository bookRepository;

    public  BookService(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }

    public  void addBook(Book book){

        if(book.getPrice() < 400)
        {
            return;
        }
        bookRepository.save(book);
    }
}
