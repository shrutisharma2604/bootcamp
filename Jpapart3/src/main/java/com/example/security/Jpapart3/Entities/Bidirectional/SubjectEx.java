package com.example.security.Jpapart3.Entities.Bidirectional;

import javax.persistence.*;

@Entity
public class SubjectEx {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    @Column(name = "SubjectName")
    private String sname;
    @ManyToOne
    @JoinColumn(name = "authorEx1_id")
    private AuthorEx1 authorEx1;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public AuthorEx1 getAuthorEx1() {
        return authorEx1;
    }

    public void setAuthorEx1(AuthorEx1 authorEx1) {
        this.authorEx1 = authorEx1;
    }
}
