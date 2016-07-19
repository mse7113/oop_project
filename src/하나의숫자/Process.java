package 하나의숫자;

public class Process {
	private Input input;
	private Output output;

	public Process() {
		input = new InputImpl();
		output = new Output();
	}

	public void 실행() {
		int 숫자;
		input.입력();
		숫자 = input.get숫자();
		output.set숫자(숫자);
		output.출력();

	}

	public static void main(String[] args) {
		Process p = new Process();
		p.실행();
	}
}
