package 두개의숫자;

public class Process {
	private Input input;
	private Output output;

	public Process() {
		input = new Input();
		output = new Output();
	}

	public void 실행() {
		int 첫번째, 두번째;
		input.입력();
		첫번째 = input.get첫번째();
		두번째 = input.get두번째();
		output.set숫자(첫번째, 두번째);
		output.출력();

	}

	public static void main(String[] args) {
		Process p = new Process();
		p.실행();
	}
}
