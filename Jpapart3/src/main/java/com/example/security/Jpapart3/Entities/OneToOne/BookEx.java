package com.example.security.Jpapart3.Entities.OneToOne;

import javax.persistence.*;

@Entity
public class BookEx {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int bid;
    private String bookName;
    @OneToOne
    @JoinColumn(name = "authorEx_id")
    private AuthorEx authorEx;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public AuthorEx getAuthorEx() {
        return authorEx;
    }

    public void setAuthorEx(AuthorEx authorEx) {
        this.authorEx = authorEx;
    }
}
