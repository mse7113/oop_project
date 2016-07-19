package 이름나이;

public class Output {
	private String 이름;
	private int 나이;

	public void setData(String 이름, int 나이) {
		this.이름 = 이름;
		this.나이 = 나이;
	}

	public void 출력() {
		System.out.println("이름은  " + 이름 + ", 나이는 " + 나이 + " 입니다.");
	}
}
