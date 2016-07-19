package 여러개큰순;

public class OutputClass {

	public void 출력(int[] 결과) {

		System.out.println("\n------ 결과 ------");
		for (int i = 0; i < 결과.length; i++) {
			System.out.println(결과[i]); // 배열 값 하나씩 출력 (큰 순 출력)
		} // 합의 결과 출력
		System.out.println("입니다");
	}

}