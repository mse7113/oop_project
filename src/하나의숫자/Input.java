package 하나의숫자;

import java.util.Scanner;

public class Input {
	private Scanner s;
	private int 숫자;

	public Input() {
		s = new Scanner(System.in);
	}

	public void 입력() {
		System.out.println("숫자 한개를 입력하세요.");
		숫자 = s.nextInt();
	}

	public int get숫자() {
		return 숫자;
	}
}
