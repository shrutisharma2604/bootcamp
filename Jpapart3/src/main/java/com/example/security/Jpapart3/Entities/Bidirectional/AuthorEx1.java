package com.example.security.Jpapart3.Entities.Bidirectional;

import com.example.security.Jpapart3.Entities.Subjects;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AuthorEx1 {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "authorEx1",cascade = CascadeType.ALL)
    private Set<SubjectEx> subjectEx;

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

    public Set<SubjectEx> getSubjectEx() {
        return subjectEx;
    }

    public void setSubjectEx(Set<SubjectEx> subjectEx) {
        this.subjectEx = subjectEx;
    }
}
