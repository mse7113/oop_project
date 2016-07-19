package 선택;

public class FourClass {
	private int[] array;
	private int[] result;
	private int max = 0;

	public void sort(int[] number) {
		array = number;
		result = new int[array.length];
		for (int i = 0; i < array.length; i++) { // 같은 크기의 배열 생성 할 것이므로 배열 크기만큼
													// 반복
			for (int j = 1; j < array.length; j++) {
				// 함수 2번과 같이 최댓값 찾기
				if (array[max] < array[j]) {
					max = j;
				}
			}
			result[i] = array[max]; // 최댓값을 하나씩 배열에 삽입
			array[max] = -1; // 값은 값 나오지 않게 최댓값에 -1 삽입
			max = 0; // 다시 맥스값에는 0자리 넣어서 비교가능하게 함
		}
	}

	public int[] getResult() {
		return result;
	}
}
