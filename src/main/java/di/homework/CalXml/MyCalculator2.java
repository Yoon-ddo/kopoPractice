package di.homework.CalXml;

public class MyCalculator2 {
	
	private int firstNum;
	private int secondNum;
	
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
		System.out.println("setFirstNum");
	}


	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
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
