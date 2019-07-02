package part4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		//������ �����̳� ����(AC = Application Context)
		ApplicationContext ac 
		= new GenericXmlApplicationContext("spring/springcontext4.xml");
		
		// �����̳ʷ� ���� "board"��� �̸��� ���� �����´�.
//		Board board = ac.getBean("board", Board.class); // Ÿ�� �������� = ������ �����̳�.getBean("Bean ID", ��ȯ Ÿ��)
		Board board = (Board)ac.getBean("board");//	Ÿ�� �������� = (Ÿ��) ������ �����̳�.getBean("Bean ID")
		

		board.boardWrite();//�����̳ʷκ��� ���� ��ü�� ���
	}
}
