package �̸�����;

import java.util.Scanner;

public class Input {
	private Scanner s;
	private String �̸�;
	private int ����;

	public Input() {
		s = new Scanner(System.in);
	}

	public void �Է�() {
		System.out.println("�̸��� �Է��ϼ���.");
		�̸� = s.nextLine();
		System.out.println("���̸� �Է��ϼ���.");
		���� = s.nextInt();
	}

	public String get�̸�() {
		return �̸�;
	}

	public int get����() {
		return ����;
	}
}
