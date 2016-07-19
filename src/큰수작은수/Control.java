package 큰수작은수;

public class Control {
	private Input input;
	private Choice choice;
	private Output output;

	public Control() {
		input = new Input();
		choice = new Choice();
		output = new Output();
	}

	public void 실행() {
		int 첫번째, 두번째, 큰수, 작은수;

		input.입력();
		첫번째 = input.get첫번째();
		두번째 = input.get두번째();
		choice.set숫자(첫번째, 두번째);
		choice.판별();
		큰수 = choice.get큰수();
		작은수 = choice.get작은수();
		output.출력(큰수, 작은수);

	}

	public static void main(String[] args) {
		Control c = new Control();
		c.실행();
	}
}
