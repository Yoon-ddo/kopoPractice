package di.homework.CalXml;

public class Calculator {

	private MyCalculator mycal;
	
	public Calculator() {
		System.out.println("Calulator()...");
	}
	
	public Calculator(MyCalculator mycal) {
		this.mycal = mycal;
		System.out.println("Calculator(mycal)...");
	}
	
	public void setMycal(MyCalculator mycal) {
		this.mycal = mycal;
		System.out.println("setMycal...");
	}
	

	public void prnResult() {
		mycal.getResult();
	}
	
}
