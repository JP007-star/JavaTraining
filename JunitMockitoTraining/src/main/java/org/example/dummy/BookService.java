package org.example.dummy;

public class BookService {

    BookRepository bookRepository;
    EmailService emailService;

    public BookService(EmailService emailService, BookRepository bookRepository) {
        this.emailService = emailService;
        this.bookRepository = bookRepository;
    }

    public  void addBook(Book book){
        bookRepository.save(book);
    }
    public int findNumberOfBook(){
       return bookRepository.findAll().size();
    }
}
