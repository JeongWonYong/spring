package part3;
//���丮 Ŭ������ �����Ѵ�
public class Factory { 
	public static Write getWriteInstance() {
		return new FreeBoardWrite();
	}
	public static Board getBoardInstance() {
		return new BoardCafe();
	}
}