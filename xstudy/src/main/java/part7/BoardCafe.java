package part7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board{
	@Autowired //type으로 찾는 것은 이름으로 찾는것보다 오타날 확률이 낮아서 좋다.ㅏ
	@Qualifier("freeWrite")
	private Write write;

	public void setWrite(Write write) {
		this.write = write;
	}
	public void boardWrite() {
		write.doWrite();
	}
	
}
