package part9;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Autowired �� Type �������� �� ��ü�� �����Ѵ�.
//@Resource �� name �������� �� ��ü�� �����Ѵ�.

@Component("board") // <Bean id ="board" class="part9.BoardCafe" />
public class BoardCafe implements Board{
	@Resource(name="qnaWrite")
	private Write write;

//	public void setWrite(Write write) {
//		this.write = write;
//	}
	public void boardWrite() {
		write.doWrite();
	}
	
}
