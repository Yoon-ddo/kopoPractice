package di.homework.CalAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	//Autowired
	public static void main(String[] args) {
		
		
		//생성자
		ApplicationContext context = new GenericXmlApplicationContext("di-homeworkcalanno.xml");
		Calculator cal = context.getBean("cal",Calculator.class);
		cal.prnResult();
	}

}
