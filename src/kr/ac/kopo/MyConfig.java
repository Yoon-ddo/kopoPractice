package kr.ac.kopo;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyConfig {
	
	private SqlSession session;
	
	public MyConfig() {
		// 객체 생성시 바로 실행되도록
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession();
			//System.out.println(session);
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public SqlSession getInstance() {
		// 외부에서 접근할 수 있도록 session객체 얻어오는 메소드
		return session;
	}
	
	
}
