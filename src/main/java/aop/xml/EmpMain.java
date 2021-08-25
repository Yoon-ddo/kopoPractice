package aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * Spring AOP기반
 * 1. Runtime기반
 * 2. Proxy기반
 * 3. 인터페이스기반
 */
public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("aop-xml.xml");
		Employee p = context.getBean("programmer", Employee.class);
		p.work();
		
		Employee d = context.getBean("designer", Employee.class);
		d.work();
		
	}

}
