package �μ����;

import java.util.Scanner;

public class Input1 {
	private int Num1, Num2;
	private Scanner sc;

	public Input1() {
		sc = new Scanner(System.in);
	}

	public void inputNum() {
		System.out.println("�� ���� �Է��ϼ���!");
		Num1 = sc.nextInt();
		Num2 = sc.nextInt();
	}

	public int getNum1() {
		return Num1;
	}

	public int getNum2() {
		return Num2;
	}
}
