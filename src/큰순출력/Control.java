package 큰순출력;

public class Control {
	private Input input;
	private Sort sort;
	private Output output;

	public Control() {
		input = new Input();
		sort = new Sort();
		output = new Output();
	}

	public void 실행() {
		int[] 숫자들;

		input.입력();
		숫자들 = input.get숫자들();
		sort.set숫자들(숫자들);
		sort.정렬();
		숫자들 = sort.get숫자들();
		output.출력(숫자들);

	}

	public static void main(String[] args) {
		Control c = new Control();
		c.실행();
	}
}
