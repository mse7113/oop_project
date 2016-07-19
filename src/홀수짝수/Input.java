package 홀수짝수;

import java.util.Scanner;

public class Input {
	private int 숫자;
	private Scanner s;

	public Input() {
		s = new Scanner(System.in);
	}

	public void 입력() {
		System.out.println("수를 입력하세요. (99를 입력하면 종료됩니다.)");
		숫자 = s.nextInt();

	}

	public void 판별() {
		if (1 > 숫자 || 숫자 > 10 & 숫자 != 99) {
			System.out.println("다시 입력하세요.");
			입력();
		}
	}

	public int get숫자() {
		return 숫자;
	}
}
