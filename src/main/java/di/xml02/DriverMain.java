package di.xml02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
	public static void main(String[] args) {
		
		
		/*
		Tire tire = new HankookTire();
		Car car = new Car(tire);
		car.prnTireBrand();
		*/
		
		ApplicationContext context = new GenericXmlApplicationContext("di-xml02.xml");
		Car car = context.getBean("car", Car.class);
		car.prnTireBrand(); // 이미 생성자 주입이 일어났으므로 prnTireBrand 정상작동
		
	}
}
