package 선택;

import java.util.Scanner;

public class InputClass {
	private int count, type;
	private int[] array = null;
	private Scanner sc;

	public InputClass() {
		sc = new Scanner(System.in);
	}

	public void InputNum() {
		System.out.println("입력할 숫자의 개수를 입력하세요."); // 배열 크기
		count = sc.nextInt();
		array = new int[count];
		for (int i = 0; i < count; i++) { // 입력받는 수로 배열 생성
			System.out.println((i + 1) + "번째 숫자를 입력하세요.");
			array[i] = sc.nextInt();
		}
		System.out.println("실행할 것을 선택해주세요. < 합 : 1, 큰 수 : 2, 홀수, 짝수 : 3, 큰 순 : 4 >"); // 실행함수
																						// 선택
		type = sc.nextInt();
	}

	public int inputType() {
		return type;
	}

	public int[] getNumber() {
		return array;
	}

}
