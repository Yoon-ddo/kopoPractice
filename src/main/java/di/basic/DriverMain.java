package di.basic;

public class DriverMain {

	
	public static void main(String[] args) {
		
		HankookTire han = new HankookTire();
		KumhoTire kum = new KumhoTire();
		
		//setter주입방식
		Car car = new Car();
		car.setTire(han);
		car.prnTireBrand();
	
		
		/* 생성자 주입방식
		 * //외부에서 만들어진 객체(tire)를 Car class에 주입함.
		 * Tire tire = new HankookTire();
		 * Car car = new Car(tire); // 의존주입 
		 * car.prnTireBrand();
		 */
		
		
		/*
		 * Car car = new Car(); 
		 * car.prnTireBrand();
		 */		
	}
}
