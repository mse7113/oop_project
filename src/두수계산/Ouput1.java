package �μ����;

public class Ouput1 {
	private int sum, min, mul, div, rem;

	public void setNum(int sum, int min, int mul, int div, int rem) {
		this.sum = sum;
		this.min = min;
		this.mul = mul;
		this.div = div;
		this.rem = rem;
	}

	public void showNum() {
		System.out.println("�� ���� ���� " + sum);
		System.out.println("�� ���� ���� " + min);
		System.out.println("�� ���� ���� " + mul);
		System.out.println("�� ���� ���� " + div);
		System.out.println("�� ���� �������� " + rem);
	}
}
