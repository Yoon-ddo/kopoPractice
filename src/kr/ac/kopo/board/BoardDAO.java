package kr.ac.kopo.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;

public class BoardDAO {
	private SqlSession session;
	
	
	public BoardDAO() {
		// MyConfig객체로 DB접근
		session = new MyConfig().getInstance();
		System.out.println(session);
	}
	
	public void work() {
	
		//insert();
		//selectAll();
		//selectOne4();
		selectNos3();
		//selectWhere2();
	}
	
	
	private void selectWhere() {
		List<BoardVO> list = session.selectList("board.BoardDAO.selectWhere","파일");
		for(BoardVO board :list) {
			System.out.println(board);
		}
	}
	
	private void selectWhere2() {
			
		BoardVO vo = new BoardVO();
		//vo.setTitle("객체로 삽입");
		vo.setWriter("홍길동");
		
		List<BoardVO> list = session.selectList("board.BoardDAO.selectWhere2",vo);
		for(BoardVO board :list) {
			System.out.println(board);
		}
	}
	
	
	
	
	/* 여러개의 No로 조회 
	 * select * from t_board where no in(1,2,4,7,11,15,18,20,21);
	 */
	private void selectNos() {
		BoardVO vo = new BoardVO();
		vo.setNos(new int[] {1,2,4,7,11,15,18,20,21});

		List<BoardVO> list = session.selectList("board.BoardDAO.selectNos", vo);
		for(BoardVO b:list) {
			System.out.println(b);
		}
	}
	
	private void selectNos2() {

		List<Integer> nos = new ArrayList<>();
		nos.add(1);
		nos.add(2);
		nos.add(3);
		nos.add(4);
		nos.add(5);
		
		List<BoardVO> list = session.selectList("board.BoardDAO.selectNos2", nos);
		
		for(BoardVO b:list) {
			System.out.println(b);
		}
	}
	
	private void selectNos3() {
		
		int[] nos = new int[] {1,2,3,4,5,6,7}; 
		List<BoardVO> list = session.selectList("board.BoardDAO.selectNos3", nos);		 
		
		for(BoardVO b : list) {
			System.out.println(b);
		}

	}
	

	private void selectOne() {
		BoardVO vo = new BoardVO();
		vo.setNo(42);
		BoardVO board = session.selectOne("board.BoardDAO.selectOne", vo);
		System.out.println(board);
	}
	
	private void selectOne2() {
		
		BoardVO board = session.selectOne("board.BoardDAO.selectOne2", 42);
		System.out.println(board);
	}
	
	private void selectOne3() {
		
		BoardVO board = session.selectOne("board.BoardDAO.selectOne3", 42);
		System.out.println(board);
	}
	
	private void selectOne4() {
		
		
		BoardVO board = new BoardVO();
		board.setNo(42);
		
		Map<String, Object> map = session.selectOne("board.BoardDAO.selectOne4", board);
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}

	}
	
	
	private void selectAll() {
		//board.xml파일에서 return타입설정해줬기 때문에 자동으로 형변환 됨.
		List<BoardVO> list = session.selectList("board.BoardDAO.selectAll");
		for(BoardVO board:list) {
			System.out.println(board);
		}
		
		
	}
	
	private void insert() {
		
		BoardVO vo = new BoardVO();
		vo.setTitle("객체로 삽입");
		vo.setWriter("홍길동");
		vo.setContent("삽입왜안돼 ㅠ");
		
		// "namespace.id"형식으로 작성
		session.insert("board.BoardDAO.newBoard", vo);
		// commit필요
		session.commit();
		
		System.out.println("삽입완료");
	}

}
