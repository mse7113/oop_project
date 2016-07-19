package 객체사칙연산;

public class Calculate {
	private int 첫번째, 두번째, 선택숫자, 결과;

	public void setData(int 첫번째, int 두번째, int 선택숫자) {
		this.첫번째 = 첫번째;
		this.두번째 = 두번째;
		this.선택숫자 = 선택숫자;
	}

	public void 사칙연산() {
		switch (선택숫자) { // 사용자가 선택한 함수 실행
		case 1:
			결과 = 첫번째 + 두번째;
			break;
		case 2:
			if (첫번째 > 두번째) {
				결과 = 첫번째 - 두번째;
			} else {
				결과 = 두번째 - 첫번째;
			}
			break;
		case 3:
			결과 = 첫번째 * 두번째;
			break;
		case 4:
			if (첫번째 > 두번째) {
				결과 = 첫번째 / 두번째;
			} else {
				결과 = 두번째 / 첫번째;
			}
			break;
		case 5:
			if (첫번째 > 두번째) {
				결과 = 첫번째 % 두번째;
			} else {
				결과 = 두번째 % 첫번째;
			}
			break;
		}

	}

	public int get결과() {
		return 결과;
	}
}
