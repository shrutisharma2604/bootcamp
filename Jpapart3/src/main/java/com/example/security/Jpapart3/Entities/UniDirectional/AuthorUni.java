package com.example.security.Jpapart3.Entities.UniDirectional;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AuthorUni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "authorUni_id",referencedColumnName = "id")
    private Set<BookUni> bookUnis;

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

    public Set<BookUni> getBookUnis() {
        return bookUnis;
    }

    public void setBookUnis(Set<BookUni> bookUnis) {
        this.bookUnis = bookUnis;
    }
}
