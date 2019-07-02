package part7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board{
	@Autowired //type���� ã�� ���� �̸����� ã�°ͺ��� ��Ÿ�� Ȯ���� ���Ƽ� ����.��
	@Qualifier("freeWrite")
	private Write write;

	public void setWrite(Write write) {
		this.write = write;
	}
	public void boardWrite() {
		write.doWrite();
	}
	
}
