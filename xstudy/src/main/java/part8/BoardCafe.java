package part8;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//@Autowired 는 Type 기준으로 빈 객체를 선택한다.
//@Resource 는 name 기준으로 빈 객체를 선택한다.

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
