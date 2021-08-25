package di.homework.CalAnno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyCalculator {
	private int firstNum;
	private int secondNum;
	
	
	// @Value(10)
	public MyCalculator(@Value("10") String firstNum, @Value("3") String secondNum) {
		this.firstNum = Integer.parseInt(firstNum);
		this.secondNum = Integer.parseInt(secondNum);
		System.out.println("MyCalculator(fir,sec)...");
	}

	

	public void setFirstNum(@Value("10") String firstNum) {
		this.firstNum = Integer.parseInt(firstNum);
		System.out.println("setFirstNum");
	}


	public void setSecondNum(@Value("3") String secondNum) {
		this.secondNum = Integer.parseInt(secondNum);
		System.out.println("setSecondNum");
	}

	
	public int getAdd() {
		
		return this.firstNum + this.secondNum;
	}
	
	public int getMin() {
			
			return this.firstNum - this.secondNum;
		}
	
	public int getMul() {
		
		return this.firstNum * this.secondNum;
	}
	
	public int getDiv() {
		
		return this.firstNum / this.secondNum;
	}
	
	public void getResult() {
		
		System.out.println(this.firstNum + "+" + this.secondNum + "=" + getAdd());
		System.out.println(this.firstNum + "-" + this.secondNum + "=" + getMin());
		System.out.println(this.firstNum + "*" + this.secondNum + "=" + getMul());
		System.out.println(this.firstNum + "/" + this.secondNum + "=" + getDiv());
		
	}
	
	

}
