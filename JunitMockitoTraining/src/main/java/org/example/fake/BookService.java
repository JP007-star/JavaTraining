package org.example.fake;

public class BookService {

    BookRepository bookRepository;


    public  BookService(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }


    public  void addBook(Book book){
        bookRepository.save(book);
    }
    public int findNumberOfBook(){
       return bookRepository.findAll().size();
    }
}
