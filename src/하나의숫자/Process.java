package �ϳ��Ǽ���;

public class Process {
	private Input input;
	private Output output;

	public Process() {
		input = new InputImpl();
		output = new Output();
	}

	public void ����() {
		int ����;
		input.�Է�();
		���� = input.get����();
		output.set����(����);
		output.���();

	}

	public static void main(String[] args) {
		Process p = new Process();
		p.����();
	}
}
