package �ΰ��Ǽ���;

public class Process {
	private Input input;
	private Output output;

	public Process() {
		input = new Input();
		output = new Output();
	}

	public void ����() {
		int ù��°, �ι�°;
		input.�Է�();
		ù��° = input.getù��°();
		�ι�° = input.get�ι�°();
		output.set����(ù��°, �ι�°);
		output.���();

	}

	public static void main(String[] args) {
		Process p = new Process();
		p.����();
	}
}
