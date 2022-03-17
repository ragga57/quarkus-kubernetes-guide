package org.acme.rest.json.Clients;

import org.acme.rest.json.DTOs.Book;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RegisterRestClient(configKey = "book-service")
public interface BookServiceRestClient {
    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    List<Book> getAll();

    @POST
    @Path("/books/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Book createBook(Book book);
}