package di.homework.CalXml;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		// 생성자 주입
		System.out.println("생성자주입");
		ApplicationContext context = new GenericXmlApplicationContext("di-homeworkcalxml01.xml");
		Calculator cal = context.getBean("cal",Calculator.class);
		cal.prnResult();
		System.out.println();
		
		// Setter
		System.out.println("Setter주입");
		ApplicationContext context2 = new GenericXmlApplicationContext("di-homeworkcalxml02.xml");
		Calculator2 cal2 = context2.getBean("cal2", Calculator2.class);
		cal2.prnResult();

	}
}
