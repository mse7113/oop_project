package 객체사칙연산;

import java.util.Scanner;

public class Input {
	private Scanner s;
	private int 첫번째, 두번째, 선택숫자;

	public Input() {
		s = new Scanner(System.in);
	}

	public void 입력() {
		System.out.println("두 수를 입력하세요.");
		첫번째 = s.nextInt();
		두번째 = s.nextInt();
		System.out.println("실행할 것을 선택하세요. 합 : 1 , 차 : 2 , 곱 : 3 , 몫 : 4 , 나머지 : 5 ");
		선택숫자 = s.nextInt();
	}

	public int get첫번째() {
		return 첫번째;
	}

	public int get두번째() {
		return 두번째;
	}

	public int get선택숫자() {
		return 선택숫자;
	}
}
