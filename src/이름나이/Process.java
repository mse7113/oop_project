package �̸�����;

public class Process {
	private Input input;
	private Output output;

	public Process() {
		input = new Input();
		output = new Output();
	}

	public void ����() {
		String �̸�;
		int ����;
		input.�Է�();
		�̸� = input.get�̸�();
		���� = input.get����();
		output.setData(�̸�, ����);
		output.���();

	}

	public static void main(String[] args) {
		Process p = new Process();
		p.����();
	}
}
