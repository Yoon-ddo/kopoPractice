package di.xml01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
	public static void main(String[] args) {
		
		/*
		Car car = new Car();
		Tire tire = new HankookTire();
		car.setTire(tire);
		car.prnTireBrand();
		*/
		
		// SpringContainer
		/*
		ApplicationContext context = new GenericXmlApplicationContext("di-xml01.xml");
		Car car = context.getBean("car",Car.class);
		Tire tire = context.getBean("tire", Tire.class);
		car.setTire(tire);
		car.prnTireBrand();
		*/
		
		
		// new하고 setter까지 한번에 해치우고 싶을 때
		ApplicationContext context = new GenericXmlApplicationContext("di-xml01.xml");
		Car car = context.getBean("car2",Car.class);
		car.prnTireBrand();
		
		
	}
}
