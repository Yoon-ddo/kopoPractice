package di.anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Autowired


@Component
public class Car2 {

	@Autowired(required = false) //의존 주입하려는 객체가 없다면 Null로 비워둬! (required = false)
	@Qualifier("kumhoTire")
	private Tire tire;

	
	public Car2() {
		System.out.println("Car()...");
	}

	/*
	 * 매개변수 2개들어간다고 가정하면, 앞에는 금호, 뒤에는 한국타이어를 넣고싶다.
	 * public Car(@Qualifier("hankookTire") Tire tire, @Qualifier("kumhoTire") Tire tire)
	 * 
	 * @Autowired 
	 * public Car(@Qualifier("hankookTire") Tire tire) { 
	 * 	this.tire = tire; 
	 * 	System.out.println("Car(Tire)..."); 
	 * }
	 */
	
	//@Autowired
	//@Qualifier("kumhoTire") // 금호타이어 이름의 객체 주입
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()...");
	}
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand() );
	}
	
}
