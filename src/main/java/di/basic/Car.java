package di.basic;

public class Car {
	//의존관계 설정
	private Tire tire;
	
	
	/*
	public Car() {
		//의존관계 설정
		tire = new HankookTire();
	}
	*/
	public Car() {
		//타이어없음
	}
	
	
	
	// 의존주입(DI) : 생성자 주입.
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand() );
	}


	// DI(의존주입) : setter주입
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()...");
	}
	
	
	
	
	
	
}
