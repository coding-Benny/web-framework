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
		
		Category category1 = new Category();
		category1.setName("컴퓨터");
		
		Category category2 = new Category();
		category2.setName("자동차");
		
		Product product1 = new Product();
		product1.setName("Notebook1");
		product1.setPrice(2000);
		product1.setDescription("Awesome Notebook!!");
		product1.setCategory(category1);
		
		Product product2 = new Product();
		product2.setName("Notebook2");
		product2.setPrice(3000);
		product2.setDescription("Powerful Notebook!!");
		product2.setCategory(category1);
		
		Product product3 = new Product();
		product3.setName("Sonata");
		product3.setPrice(3000);
		product3.setDescription("Popular Car!!");
		product3.setCategory(category2);
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(product1);
		session.save(product2);
		session.save(product3);
		
		session.delete(product3);	// product3 -> category2
		
		product1.setCategory(null); // product1 ->
		session.delete(product1);
		
		/*
		 * Product savedProduct = session.get(Product.class, id1);
		 * System.out.println("saved product" + savedProduct);
		 */
		/*
		 * Query<Product> aQuery = session.createQuery("from Product", Product.class);
		 * // HQL List<Product> products = aQuery.getResultList();
		 * System.out.println(products);
		 */
		
		tx.commit();
		
		session.close();
		sessionFactory.close();
		
	}

}
