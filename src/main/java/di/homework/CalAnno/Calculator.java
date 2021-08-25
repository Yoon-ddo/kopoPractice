package di.homework.CalAnno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	@Resource(name="myCalculator")
	private MyCalculator mycal;
	
	public Calculator() {
		System.out.println("Calulator()...");
	}
	
	
	public Calculator(MyCalculator mycal) {
		this.mycal = mycal;
		System.out.println("Calculator(mycal)...");
	}
	
	//@Autowired
	public void setMycal(MyCalculator mycal) {
		this.mycal = mycal;
		System.out.println("setMycal...");
	}
	

	public void prnResult() {
		mycal.getResult();
	}

}
