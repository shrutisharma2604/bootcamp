package com.example.security.Jpapart3.Entities;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @Embedded
    private Address address;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private Set<Subjects> subject;
    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
    private Book book;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Subjects> getSubject() {
        return subject;
    }

    public void setSubject(Set<Subjects> subject) {
        this.subject = subject;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

  /*  public void addSubjects(Subjects subjects) {
        if (subjects != null) {
            if (subject == null) {
                subject = new HashSet<>();
            }
            subjects.setAuthor(this);
            subject.add(subjects);
        }
    }*/
}

