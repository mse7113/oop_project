package ū�����;

public class Control {
	private Input input;
	private Sort sort;
	private Output output;

	public Control() {
		input = new Input();
		sort = new Sort();
		output = new Output();
	}

	public void ����() {
		int[] ���ڵ�;

		input.�Է�();
		���ڵ� = input.get���ڵ�();
		sort.set���ڵ�(���ڵ�);
		sort.����();
		���ڵ� = sort.get���ڵ�();
		output.���(���ڵ�);

	}

	public static void main(String[] args) {
		Control c = new Control();
		c.����();
	}
}
