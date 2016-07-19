package 이름나이;

public class Process {
	private Input input;
	private Output output;

	public Process() {
		input = new Input();
		output = new Output();
	}

	public void 실행() {
		String 이름;
		int 나이;
		input.입력();
		이름 = input.get이름();
		나이 = input.get나이();
		output.setData(이름, 나이);
		output.출력();

	}

	public static void main(String[] args) {
		Process p = new Process();
		p.실행();
	}
}
