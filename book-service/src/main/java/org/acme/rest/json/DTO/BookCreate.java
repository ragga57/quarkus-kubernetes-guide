package org.acme.rest.json.DTO;

import java.io.Serializable;

public class BookCreate implements Serializable {
    public String name;
    public String note;

    /**
     * Default constructor required for Jackson serializer
     */
    public BookCreate() {

    }

    public BookCreate(String name, String note) {
        this.name = name;
        this.note = note;
    }
}
