package aop.pojo;

public class EmpMain {
		
	public static void main(String[] args) {
		Employee e = new Programmer();
		e.work();
		
		Employee d = new Designer();
		d.work();
		
		Employee m = new Manager();
		m.work();
	}

}
