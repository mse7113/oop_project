package 큰순출력;

import java.util.Scanner;

public class Input {
	private Scanner s;
	private int[] 숫자들;

	public Input() {
		s = new Scanner(System.in);
		숫자들 = new int[3];
	}

	public void 입력() {
		System.out.println("숫자 세개를 입력하세요.");
		숫자들[0] = s.nextInt();
		숫자들[1] = s.nextInt();
		숫자들[2] = s.nextInt();

	}

	public int[] get숫자들() {
		return 숫자들;
	}

}
