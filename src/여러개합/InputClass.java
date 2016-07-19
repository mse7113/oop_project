package 여러개합;

import java.util.Scanner;

public class InputClass {
	private int 개수;
	private int[] 숫자들 = null;
	private Scanner sc;

	public InputClass() {
		sc = new Scanner(System.in);
	}

	public void 입력() {
		System.out.println("입력할 숫자의 개수를 입력하세요."); // 배열 크기
		개수 = sc.nextInt();
		숫자들 = new int[개수];
		for (int i = 0; i < 개수; i++) { // 입력받는 수로 배열 생성
			System.out.println((i + 1) + "번째 숫자를 입력하세요.");
			숫자들[i] = sc.nextInt();
		}
		// 선택
	}

	public int[] get숫자들() {
		return 숫자들;
	}

}
