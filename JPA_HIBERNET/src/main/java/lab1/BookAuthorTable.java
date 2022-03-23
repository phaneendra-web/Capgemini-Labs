package lab1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookAuthorTable {
public static void main(String[] args) {
	Configuration config = new Configuration();
	
	SessionFactory sessionFactory = config.configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction(); 
    
	
	BookTable book=new BookTable();
	book.setIsbn(1);
	book.setPrice(1000);
	book.setTitle("Balu");
	AuthorTable author=new AuthorTable();
	author.setA_id(1001);
	author.setA_name("Phain");
	
	author.getAuthor().add(book);
	session.save(book);
	session.save(author);
	
	BookTable bo= session.get(BookTable.class, 1);
	System.out.println(bo);
          
    transaction.commit();
    session.close();  
        
        
}
}