package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		
		
		//xml파일에 있는 bean읽음 (도도도도~)
		ApplicationContext context = new GenericXmlApplicationContext("beanContainer.xml"); // 권고사항
		/*
		 * 절대경로, 프로젝트 경로					
			new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
		 * src/main/resource기분					
			new ClassPathXmlApplicationContext("beanContainer.xml");
		 * 둘다사용가능
			new GenericXmlApplicationContext("beanContainer.xml");
		*/
		
		//ID가 Hello인 객체 가져옴
		Hello obj = (Hello)context.getBean("hello");
		// Hello obj2 = (Hello)context.getBean("hello"); 일때 obj와 obj2는 주소값이 같다.
		System.out.println(obj);
		obj.prnMsg();
		
		Hello obj2 = context.getBean("hello2", Hello.class); 
		//같은 클래스지만 id가 달라서 주소값이 다르다.?
		System.out.println(obj2);
		obj2.prnMsg();
		
		
		
		/*Hello obj = new Hello();
		obj.prnMsg(); */
		
		
	}
}
