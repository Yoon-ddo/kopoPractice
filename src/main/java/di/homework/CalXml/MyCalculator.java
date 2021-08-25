package di.homework.CalXml;

public class MyCalculator {
	
	private int firstNum;
	private int secondNum;
	
	
	public MyCalculator(int first, int second) {
		this.firstNum = first;
		this.secondNum = second;
		System.out.println("MyCalculator(fir,sec)...");
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
