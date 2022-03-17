package org.acme.rest.json;


import org.acme.rest.json.Clients.BookServiceRestClient;
import org.acme.rest.json.DTOs.Book;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Set;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/books")
public class BookResource {

    private final BookServiceRestClient _bookClient;

    public BookResource(@RestClient BookServiceRestClient bookClient) {
        _bookClient = bookClient;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAll() {
        return _bookClient.getAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Book create(Book book) {
        return _bookClient.createBook(book);
    }
}
