
package 선택;

public class OneClass {
	private int[] result = new int[1]; // 리턴값 배열 생성

	public void sum(int[] number) {
		for (int i = 0; i < number.length; i++) { // 배열 첫번째 수부터 더하기
			result[0] = result[0] + number[i];
		}

	}

	public int[] getResult() {
		return result;
	}

}
