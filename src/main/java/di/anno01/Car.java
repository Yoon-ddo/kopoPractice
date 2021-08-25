package di.anno01;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	//@Autowired // Car생성시 의존성을 지닌 Tire에 자동으로 객체 삽입
	private Tire tire;
	// Car의 (tire 변수) ->  HankookTire

	public Car() {
		System.out.println("Car()...");
	}

	//@Autowired // Autowired로 인해 생성자 호출되면서 자동으로 tire 주입
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire)...");
	}
	
	//@Autowired //반드시 기본생성자가 있어야함!!!!
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()...");
	}
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand() );
	}
}
