package di.anno03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Resource : 이름매칭이 먼저라 Qualifier이 있어도 찾고자하는 Resource이름이 있어서 한국타이어가 먼저나옴

@Component
public class Car {

	//@Resource
	//@Qualifier("kumhoTire")
	
	
	@Resource(name="hankookTire")
	@Qualifier("kumhoTire") // 잘안씀
	private Tire tire;

	
	public Car() {
		System.out.println("Car()...");
	}

	@Resource(name="hankookTire")
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()...");
	}
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand() );
	}
	
}
