package 두개의숫자;

public class Output {
	private int 첫번째, 두번째;

	public void set숫자(int 첫번째, int 두번째) {
		this.첫번째 = 첫번째;
		this.두번째 = 두번째;
	}

	public void 출력() {
		System.out.println("입력하신 수는 " + 첫번째 + "," + 두번째 + " 입니다.");
	}
}
