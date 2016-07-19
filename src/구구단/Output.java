package 구구단;

public class Output {
	private int 숫자;

	public void set숫자(int 숫자) {
		this.숫자 = 숫자;
	}

	public void 출력() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(숫자 + "*" + i + "=" + 숫자 * i);
		}
	}
}
