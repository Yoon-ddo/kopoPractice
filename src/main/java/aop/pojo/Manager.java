package aop.pojo;

public class Manager implements Employee{

	public void work() {
		Action.gotoOffice();
		System.out.println("팀원들과 회의를 한다.");
//		Action.getoffOffice(); // 개발자가 안넣으면 실행안됨
	}

}
