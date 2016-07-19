package 여러개홀짝;

public class Calculate {
	private int[] 결과 = new int[2];

	public Calculate() {
		결과[0] = 0;
		결과[1] = 0;
	}

	public void 계산(int[] 숫자들) {
		for (int i = 0; i < 숫자들.length; i++) {
			if (숫자들[i] % 2 == 0) { // 나머지가 0 인 짝수면 카운트
				결과[0]++; // 배열 첫번째 자리에 값
			} else {
				결과[1]++; // 나머지가 0이 아닌 홀수면 카운트
			} // 배열 두번째 자리에 값
		}
	}

	public int[] get결과() {
		return 결과;
	}

}