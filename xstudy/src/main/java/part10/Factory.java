package part10;
//팩토리 클래스를 생성한다
public class Factory { 
	public static Write getWriteInstance() {
		return new FreeBoardWrite();
	}
	public static Board getBoardInstance() {
		return new BoardCafe();
	}
}
