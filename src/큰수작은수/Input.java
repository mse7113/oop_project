package 큰수작은수;

import java.util.Scanner;

public class Input {
	private Scanner s;
	private int 첫번째, 두번째;

	public Input() {
		s = new Scanner(System.in);
	}

	public void 입력() {
		System.out.println("숫자 두개를 입력하세요.");
		첫번째 = s.nextInt();
		두번째 = s.nextInt();
	}

	public int get첫번째() {
		return 첫번째;
	}

	public int get두번째() {
		return 두번째;
	}
}
