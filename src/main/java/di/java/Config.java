package di.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//Configuration방식 번거로우니까 사용  basePackages는 배열형태다
@ComponentScan(basePackages= {"di.java"})
public class Config {
	
	/*
	@Bean
	public Car car() {
		return new Car();
	}
	
	//@Bean // 반드시 붙여주어야 만들어짐
	//@Qualifier("hankook") // 이름 줄이기
	public HankookTire hankookTire() { //Tire클래스로 해도 ㅇㅋ
		return new HankookTire();
	}
	
	@Bean 
	@Qualifier("kumho")
	public KumhoTire kumhoTire() {
		return new KumhoTire();
	}
	*/
	
	
	
	
	
}
