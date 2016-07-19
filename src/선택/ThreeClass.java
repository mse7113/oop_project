package 선택;

public class ThreeClass {
	private int[] result = new int[2];

	public ThreeClass() {
		result[0] = 0;
		result[1] = 0;
	}

	public void oddeven(int[] number) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) { // 나머지가 0 인 짝수면 카운트
				result[0]++; // 배열 첫번째 자리에 값
			} else {
				result[1]++; // 나머지가 0이 아닌 홀수면 카운트
			} // 배열 두번째 자리에 값
		}
	}

	public int[] getResult() {
		return result;
	}

}