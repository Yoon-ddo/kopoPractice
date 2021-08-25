package aop.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAspect {
	
	
	
	//@After("execution(* aop.test.*.setAge(..))")
	public void checkAge(JoinPoint joinPoint) {
		//System.out.println(joinPoint.getTarget());
		//System.out.println(joinPoint.getThis());
		
		//System.out.println(Arrays.toString(joinPoint.getArgs()));
		
		
		Object[] args = joinPoint.getArgs();
		int age = (Integer)args[0];
		if( age > 20) {
			System.out.println("미성년입니다.");
		}else {
			System.out.println("성년입니다.");
		}
	}
	
	
	
	
	//@Around("execution(* aop.test.*.setAge(..))") // 일단 가져와서 내가 시점 설정가능
	public void checkAdult2(ProceedingJoinPoint joinPoint) throws Throwable{
		/*joinPoint.proceed();// After : setAge를 수행 후 공통코드 수행
		System.out.println("checkAdult2"); // = 공통코드
		joinPoint.proceed();// Before : 공통코드 수행 후 setAge수행
		// joinPoint.proceed(); = 핵심코드
		*/
		
		//Before
		joinPoint.proceed();
		Object[] args = joinPoint.getArgs();
		int age = (Integer)args[0];
		if( age > 20) {
			System.out.println("미성년입니다.");
		}else {
			System.out.println("성년입니다.");
		}

	}
	
	
	@AfterThrowing(pointcut="execution(* aop.test.*.setAge(..))", throwing="ex")
	public void error(JoinPoint joinPoint, Throwable ex) {
		System.out.println("예외처리 : "+ ex.toString());
	}
	

}
