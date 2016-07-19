package 여러개큰순;

public class Calculate {
	private int[] 결과;

	public void 계산(int[] 숫자들) {
		int max = 0;
		결과 = new int[숫자들.length];
		for (int i = 0; i < 숫자들.length; i++) { // 같은 크기의 배열 생성 할 것이므로 배열 크기만큼
												// 반복
			for (int j = 1; j < 숫자들.length; j++) {
				// 함수 2번과 같이 최댓값 찾기
				if (숫자들[max] < 숫자들[j]) {
					max = j;
				}
			}
			결과[i] = 숫자들[max]; // 최댓값을 하나씩 배열에 삽입
			숫자들[max] = -1; // 값은 값 나오지 않게 최댓값에 -1 삽입
			max = 0; // 다시 맥스값에는 0자리 넣어서 비교가능하게 함
		}
	}

	public int[] get결과() {
		return 결과;
	}
}
