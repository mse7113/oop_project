package ū��������;

import java.util.Scanner;

public class Input {
	private Scanner s;
	private int ù��°, �ι�°;

	public Input() {
		s = new Scanner(System.in);
	}

	public void �Է�() {
		System.out.println("���� �ΰ��� �Է��ϼ���.");
		ù��° = s.nextInt();
		�ι�° = s.nextInt();
	}

	public int getù��°() {
		return ù��°;
	}

	public int get�ι�°() {
		return �ι�°;
	}
}
