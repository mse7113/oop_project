package Ȧ��¦��;

import java.util.Scanner;

public class Input {
	private int ����;
	private Scanner s;

	public Input() {
		s = new Scanner(System.in);
	}

	public void �Է�() {
		System.out.println("���� �Է��ϼ���. (99�� �Է��ϸ� ����˴ϴ�.)");
		���� = s.nextInt();

	}

	public void �Ǻ�() {
		if (1 > ���� || ���� > 10 & ���� != 99) {
			System.out.println("�ٽ� �Է��ϼ���.");
			�Է�();
		}
	}

	public int get����() {
		return ����;
	}
}
