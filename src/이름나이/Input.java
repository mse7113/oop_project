package 이름나이;

import java.util.Scanner;

public class Input {
	private Scanner s;
	private String 이름;
	private int 나이;

	public Input() {
		s = new Scanner(System.in);
	}

	public void 입력() {
		System.out.println("이름을 입력하세요.");
		이름 = s.nextLine();
		System.out.println("나이를 입력하세요.");
		나이 = s.nextInt();
	}

	public String get이름() {
		return 이름;
	}

	public int get나이() {
		return 나이;
	}
}
