package ū�����;

import java.util.Scanner;

public class Input {
	private Scanner s;
	private int[] ���ڵ�;

	public Input() {
		s = new Scanner(System.in);
		���ڵ� = new int[3];
	}

	public void �Է�() {
		System.out.println("���� ������ �Է��ϼ���.");
		���ڵ�[0] = s.nextInt();
		���ڵ�[1] = s.nextInt();
		���ڵ�[2] = s.nextInt();

	}

	public int[] get���ڵ�() {
		return ���ڵ�;
	}

}
