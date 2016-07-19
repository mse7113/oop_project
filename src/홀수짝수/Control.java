package 홀수짝수;

public class Control {
	private Input i;
	private Calculate c;
	private Output o;

	public Control() {
		i = new Input();
		c = new Calculate();
		o = new Output();
	}

	public void 제어() {
		int 숫자, 짝수결과, 판별;
		int[] 홀수결과;
		do {
			i.입력();
			i.판별();
			숫자 = i.get숫자();
			if (숫자 == 99) {
				o.종료();
			} else {
				c.계산(숫자);
				홀수결과 = c.get홀수결과();
				짝수결과 = c.get짝수결과();
				판별 = c.get판별();
				if (판별 == 1) {
					o.홀수결과(숫자, 홀수결과);
				} else {
					o.짝수결과(짝수결과);
				}
			}

		} while (숫자 != 99);
	}

	public static void main(String[] args) {
		Control c = new Control();
		c.제어();
	}
}
