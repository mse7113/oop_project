package 두수계산;

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
		System.out.println("두 수의 합은 " + sum);
		System.out.println("두 수의 차는 " + min);
		System.out.println("두 수의 곱은 " + mul);
		System.out.println("두 수의 몫은 " + div);
		System.out.println("두 수의 나머지는 " + rem);
	}
}
