package org.acme.rest.json.Service;

import org.acme.rest.json.DTO.BookCreate;
import org.acme.rest.json.Entity.Book;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class BookService {

    @Transactional
    public Book create(BookCreate book){
        Book newBook = new Book();
        newBook.name = book.name;
        newBook.note = book.note;
        newBook.persist();
        return newBook;
    }

    public List<Book> getAll(){
        return Book.getAll();
    }

    public Book getByName(String name){
        return Book.getByName(name);
    }


}
