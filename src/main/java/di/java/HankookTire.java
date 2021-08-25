package di.java;

import org.springframework.stereotype.Component;

@Component("hankook")
public class HankookTire implements Tire {

	public HankookTire() {
		System.out.println("HankookTire()...");
	}
		
	public String getBrand() {
		// TODO Auto-generated method stub
		return "한국타이어";
	}

}
