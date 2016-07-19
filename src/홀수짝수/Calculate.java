package 홀수짝수;

public class Calculate {
	private int[] 홀수결과;
	private int 짝수결과, 판별;

	public Calculate() {
		홀수결과 = new int[9];
	}

	public void 계산(int 숫자) {
		if (숫자 % 2 == 1) {
			for (int i = 0; i < 9; i++) {
				홀수결과[i] = 숫자 * (i + 1);
			}
			판별 = 1;
		} else {
			for (int i = 1; i <= 숫자 * 10; i++) {
				짝수결과 = 짝수결과 + i;
			}
			판별 = 2;
		}
	}

	public int[] get홀수결과() {
		return 홀수결과;
	}

	public int get짝수결과() {
		return 짝수결과;
	}

	public int get판별() {
		return 판별;
	}
}
