package 선택;

public class TwoClass {
	private int[] array = null;
	private int[] result = new int[1];

	public void Most(int[] number) {
		array = number;
		int max = 0, i;
		for (i = 1; i < array.length; i++) {
			if (array[max] < array[i]) { // 맥스값을 0에서 시작 나머지 비교 후
				max = i;
			}
		}
		result[0] = array[max];

	}

	public int[] getResult() {
		return result;
	}

}
