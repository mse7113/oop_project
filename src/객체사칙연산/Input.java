package ��ü��Ģ����;

import java.util.Scanner;

public class Input {
	private Scanner s;
	private int ù��°, �ι�°, ���ü���;

	public Input() {
		s = new Scanner(System.in);
	}

	public void �Է�() {
		System.out.println("�� ���� �Է��ϼ���.");
		ù��° = s.nextInt();
		�ι�° = s.nextInt();
		System.out.println("������ ���� �����ϼ���. �� : 1 , �� : 2 , �� : 3 , �� : 4 , ������ : 5 ");
		���ü��� = s.nextInt();
	}

	public int getù��°() {
		return ù��°;
	}

	public int get�ι�°() {
		return �ι�°;
	}

	public int get���ü���() {
		return ���ü���;
	}
}
