package ū��������;

public class Control {
	private Input input;
	private Choice choice;
	private Output output;

	public Control() {
		input = new Input();
		choice = new Choice();
		output = new Output();
	}

	public void ����() {
		int ù��°, �ι�°, ū��, ������;

		input.�Է�();
		ù��° = input.getù��°();
		�ι�° = input.get�ι�°();
		choice.set����(ù��°, �ι�°);
		choice.�Ǻ�();
		ū�� = choice.getū��();
		������ = choice.get������();
		output.���(ū��, ������);

	}

	public static void main(String[] args) {
		Control c = new Control();
		c.����();
	}
}
