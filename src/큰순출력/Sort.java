package 큰순출력;

public class Sort {
	private int[] 숫자들;

	public void set숫자들(int[] 숫자들) {
		this.숫자들 = 숫자들;
	}

	public void 정렬() {
		int i, j;
		int max;
		int temp;
		for (i = 2; i >= 0; i--) {
			max = 숫자들[i];
			temp = i;
			for (j = i; j > 0; j--) {

				if (max < 숫자들[j - 1]) {
					max = 숫자들[j - 1];
					temp = j - 1;
				}
			}
			숫자들[temp] = 숫자들[i];
			숫자들[i] = max;
		}
	}

	public int[] get숫자들() {
		return 숫자들;
	}

}
