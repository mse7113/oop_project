package 두수계산;

public class Calculate1 {
	private int Num1, Num2;
	private int sum, min, mul, div, rem;

	public void setNum(int Num1, int Num2) {
		this.Num1 = Num1;
		this.Num2 = Num2;
	}

	public void calculNum() {
		sum = Num1 + Num2;
		min = Num1 - Num2;
		mul = Num1 * Num2;
		div = Num1 / Num2;
		rem = Num1 % Num2;
	}

	public int getSum() {
		return sum;
	}

	public int getMin() {
		return min;
	}

	public int getMul() {
		return mul;
	}

	public int getDiv() {
		return div;
	}

	public int getRem() {
		return rem;
	}
}
