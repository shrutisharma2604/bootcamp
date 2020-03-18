package com.example.security.Jpapart3;

import com.example.security.Jpapart3.Entities.Address;
import com.example.security.Jpapart3.Entities.Author;
import com.example.security.Jpapart3.Entities.Bidirectional.AuthorEx1;
import com.example.security.Jpapart3.Entities.Bidirectional.SubjectEx;
import com.example.security.Jpapart3.Entities.Book;
import com.example.security.Jpapart3.Entities.OneToOne.AuthorEx;
import com.example.security.Jpapart3.Entities.OneToOne.BookEx;
import com.example.security.Jpapart3.Entities.Subjects;
import com.example.security.Jpapart3.Entities.UniDirectional.AuthorUni;
import com.example.security.Jpapart3.Entities.UniDirectional.BookUni;
import com.example.security.Jpapart3.Repositories.AuthorEx1Repo;
import com.example.security.Jpapart3.Repositories.AuthorExRepo;
import com.example.security.Jpapart3.Repositories.AuthorRepo;
import com.example.security.Jpapart3.Repositories.AuthorUniRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class Jpapart3ApplicationTests {

	@Autowired
	private AuthorRepo authorRepo;

	@Autowired
	private AuthorExRepo authorExRepo;

	@Autowired
	private AuthorEx1Repo authorEx1Repo;

	@Autowired
	private AuthorUniRepo authorUniRepo;

	@Test
	public void addAuthor(){
		Author author=new Author();author.setId(1);
		author.setFirstName("Shruti");
		author.setLastName("Sharma");

		Address address=new Address();
		address.setLoc("Rudrapur");
		address.setSno(31);
		address.setState("Uttarakhand");

		Book book=new Book();
		book.setBook_id(1);
		book.setBookName("Ramayan");
		book.setAuthor(author);

		Set<Subjects> subjects=new HashSet<>();
		Subjects s=new Subjects();
		s.setSubjectName("Hindi");
		s.setAuthor(author);

		Subjects s1=new Subjects();
		s1.setSubjectName("English");
		s1.setAuthor(author);

		Subjects s2=new Subjects();
		s2.setSubjectName("Maths");
		s2.setAuthor(author);

		subjects.add(s);
		subjects.add(s1);
		subjects.add(s2);
		author.setAddress(address);
		author.setBook(book);
		author.setSubject(subjects);

		authorRepo.save(author);
	}

	@Test
	public void addAuthorEx(){
		AuthorEx authorEx=new AuthorEx();
		authorEx.setId(1);
		authorEx.setName("Shruti");

		BookEx bookEx=new BookEx();
		bookEx.setBid(1);
		bookEx.setBookName("Hindi");
		bookEx.setAuthorEx(authorEx);
		authorEx.setBookEx(bookEx);

		authorExRepo.save(authorEx);
	}

	@Test
	public void addAuthorEx1(){
		AuthorEx1 authorEx1=new AuthorEx1();
		authorEx1.setId(1);
		authorEx1.setName("Richa");

		Set<SubjectEx> set=new HashSet<>();
		SubjectEx subjectEx=new SubjectEx();
		subjectEx.setSid(1);
		subjectEx.setSname("English");
		subjectEx.setAuthorEx1(authorEx1);
		set.add(subjectEx);

		authorEx1.setSubjectEx(set);

		authorEx1Repo.save(authorEx1);
	}

	@Test
	public void addAuthorUni(){
		AuthorUni authorUni=new AuthorUni();
		authorUni.setId(1);
		authorUni.setName("Shruti");

		Set<BookUni> bookUni=new HashSet<>();
		BookUni b1=new BookUni();
		b1.setBid(1);
		b1.setBookName("Ramayan");

		BookUni b2=new BookUni();
		b2.setBid(2);
		b2.setBookName("Geeta");

		bookUni.add(b1);
		bookUni.add(b2);

		authorUni.setBookUnis(bookUni);
		authorUniRepo.save(authorUni);

	}

	@Test
	void contextLoads() {
	}

}
