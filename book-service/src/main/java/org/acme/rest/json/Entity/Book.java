package org.acme.rest.json.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Book extends PanacheEntity {

    public String name;
    public String note;

    public static List<Book> getAll(){
        return listAll();
    }
    public static Book getByName(String name){
        return find("name", name).firstResult();
    }

}
