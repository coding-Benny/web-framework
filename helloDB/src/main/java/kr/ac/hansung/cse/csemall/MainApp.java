package kr.ac.hansung.cse.csemall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("kr/ac/hansung/cse/conf/beans.xml");
		
		OfferDao offerDao = (OfferDao) context.getBean("offerDao");
		System.out.println("The record count is " + offerDao.getRowCount());
		
		context.close();
	}

}
