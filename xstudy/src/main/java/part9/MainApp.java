package part9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		//스프링 컨테이너 생성(AC = Application Context)
		ApplicationContext ac 
		= new GenericXmlApplicationContext("spring/context9.xml");
		
		// 컨테이너로 부터 "board"라는 이름의 빈을 가져온다.
//		Board board = ac.getBean("board", Board.class);
		Board board = (Board)ac.getBean("board");
		board.boardWrite();//컨테이너로부터 받은 객체를 사용
	}
}
