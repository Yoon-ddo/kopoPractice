package aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aoptest/beancontainer.xml");
		
		Person p = context.getBean("man",Person.class);
		try{
			p.setAge(20);
			p.setAge(-15);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
