package di.homework.CalXml;

public class Calculator2 {

	private MyCalculator2 mycal2;
	
	
	public void setMycal2(MyCalculator2 mycal) {
		this.mycal2 = mycal;
		System.out.println("setMycal2()...");
	}
	

	public void prnResult() {
		mycal2.getResult();
	}
	
}
