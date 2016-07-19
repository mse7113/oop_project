
package 여러개합;

public class Calculate {
	private int 결과;

	public void 계산(int[] 숫자들) {
		for (int i = 0; i < 숫자들.length; i++) { // 배열 첫번째 수부터 더하기
			결과 = 결과 + 숫자들[i];
		}

	}

	public int get결과() {
		return 결과;
	}

}
