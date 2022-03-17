package org.acme.rest.json;

import org.acme.rest.json.DTO.BookCreate;
import org.acme.rest.json.Entity.Book;
import org.acme.rest.json.Service.BookService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookResource {

    private final BookService _bookService;

    public BookResource(BookService bookService) {
        _bookService = bookService;
    }

    @GET
    public List<Book> getAll() {
        return _bookService.getAll();
    }

    @POST
    @Path("/create")
    public Book create(BookCreate book) {
        return _bookService.create(book);
    }

}
