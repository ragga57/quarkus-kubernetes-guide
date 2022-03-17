package org.acme.rest.json.DTOs;

import java.io.Serializable;

public class Book implements Serializable {
    public String name;
    public String note;

    /**
     * Default constructor required for Jackson serializer
     */
    public Book() {

    }

    public Book(String name, String note) {
        this.name = name;
        this.note = note;
    }
}
