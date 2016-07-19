package 선택;

public class OutputClass {
	private int i, type = 0;
	private int[] result = null;

	public void setNumber(int[] result, int type) {
		this.type = type;
		this.result = result;
	}

	public void output() {

		System.out.println("\n------ 결과 ------");
		switch (type) {
		case 1: {
			System.out.println("합은 " + result[0] + "입니다"); // 합의 결과 출력
			break;
		}
		case 2: {
			System.out.println("제일 큰 수는 " + result[0] + "입니다"); // 찾은 최댓값 출력
			break;
		}
		case 3: {
			System.out.println("짝수는 " + result[0] + "개  홀수는 " + result[1] + "개 입니다");
			// 배열 첫번째, 두 번째 값 출력
			break;
		}
		case 4: {
			for (i = 0; i < result.length; i++) {
				System.out.println(result[i]); // 배열 값 하나씩 출력 (큰 순 출력)
			}
			System.out.println("입니다");
			break;

		}

		}
	}
}
