package aop.java;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAspect {
	
	@Before("execution(void aop.java.*.work())")
	public void gotoOffice() {//JoinPoint joinPoint
		//파라미터 값을 알기위해서는 반드시 JoinPoint필요.
		//joinPoint.getArgs()
		System.out.println("출근을 합니다.");
	}
	
	
	@After("execution(void aop.java.*.work())")
	public void getoutOffice() {
		System.out.println("퇴근을 합니다.");
	}
	
}
