package �ϳ��Ǽ���;

import java.util.Scanner;

public class Input {
	private Scanner s;
	private int ����;

	public Input() {
		s = new Scanner(System.in);
	}

	public void �Է�() {
		System.out.println("���� �Ѱ��� �Է��ϼ���.");
		���� = s.nextInt();
	}

	public int get����() {
		return ����;
	}
}
