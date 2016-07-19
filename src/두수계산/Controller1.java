package 두수계산;

import 두수계산.Calculate1;

public class Controller1 {
	private Input1 in;
	private Calculate1 ca;
	private Ouput1 ou;

	public Controller1() {
		in = new Input1();
		ca = new Calculate1();
		ou = new Ouput1();
	}

	public void start() {
		in.inputNum();

		ca.setNum(in.getNum1(), in.getNum2());
		ca.calculNum();

		ou.setNum(ca.getSum(), ca.getMin(), ca.getMul(), ca.getDiv(), ca.getRem());
		ou.showNum();
	}

	public static void main(String[] args) {
		Controller1 c = new Controller1();
		c.start();
	}
}
