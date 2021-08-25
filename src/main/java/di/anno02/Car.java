package di.anno02;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	//Resource는 생성자에 붙일 수 없음
	// 멤버변수, set메소드만 가능

	private Tire tire;


	public Car() {
		System.out.println("Car()...");
	}


	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire)...");
	}
	
	@Resource
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()...");
	}
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand() );
	}
}
