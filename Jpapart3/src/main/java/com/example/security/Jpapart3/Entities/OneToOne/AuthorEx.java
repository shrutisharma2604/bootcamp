package com.example.security.Jpapart3.Entities.OneToOne;

import javax.persistence.*;

@Entity
public class AuthorEx {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(mappedBy = "authorEx",cascade = CascadeType.ALL)
    private BookEx bookEx;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookEx getBookEx() {
        return bookEx;
    }

    public void setBookEx(BookEx bookEx) {
        this.bookEx = bookEx;
    }
}
