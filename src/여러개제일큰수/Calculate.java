package 여러개제일큰수;

public class Calculate {
	private int 결과;

	public void 계산(int[] 숫자들) {
		int max = 0, i;
		for (i = 1; i < 숫자들.length; i++) {
			if (숫자들[max] < 숫자들[i]) { // 맥스값을 0에서 시작 나머지 비교 후
				max = i;
			}
		}
		결과 = 숫자들[max];

	}

	public int get결과() {
		return 결과;
	}

}
