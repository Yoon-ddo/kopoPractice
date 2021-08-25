package di.java;

import org.springframework.stereotype.Component;

@Component("kumho")
public class KumhoTire implements Tire{

	public KumhoTire() {
		System.out.println("KumhoTire()...");
	}
	
	public String getBrand() {
		// TODO Auto-generated method stub
		return "금호타이어";
	}

}
