package 큰수작은수;

public class Choice {
	private int 첫번째, 두번째, 큰수, 작은수;

	public void set숫자(int 첫번째, int 두번째) {
		this.첫번째 = 첫번째;
		this.두번째 = 두번째;
	}

	public void 판별() {
		if (첫번째 > 두번째) {
			큰수 = 첫번째;
			작은수 = 두번째;
		} else {
			큰수 = 두번째;
			작은수 = 첫번째;
		}
	}

	public int get큰수() {
		return 큰수;
	}

	public int get작은수() {
		return 작은수;
	}

}
