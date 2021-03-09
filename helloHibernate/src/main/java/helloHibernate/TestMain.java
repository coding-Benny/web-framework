package helloHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		
		/*
		 * Configuration conf = new Configuration();
		 * conf.configure();
		 * sessionFactory = conf.buildSessionFactory();
		 */
		
		// chained method
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Product product1 = new Product();
		product1.setName("Notebook");
		product1.setPrice(2000);
		product1.setDescription("Awesome Notebook!!");
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(product1);
		
		tx.commit();
		
		session.close();
		sessionFactory.close();
		
	}

}
