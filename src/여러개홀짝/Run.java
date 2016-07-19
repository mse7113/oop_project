package 여러개홀짝;

public class Run {
	private InputClass input;
	private Calculate calculate;
	private OutputClass output;

	public Run() {
		input = new InputClass();
		calculate = new Calculate();
		output = new OutputClass();
	}

	public void 제어() {
		int[] 숫자들;
		int[] 결과;
		input.입력();
		숫자들 = input.get숫자들();
		calculate.계산(숫자들);
		결과 = calculate.get결과();
		output.출력(결과);

	}

	public static void main(String[] args) {
		Run r = new Run();
		r.제어();
	}
}