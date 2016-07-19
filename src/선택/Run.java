package 선택;

public class Run {
	private InputClass Input;
	private OneClass One;
	private TwoClass Two;
	private ThreeClass Three;
	private FourClass Four;
	private OutputClass Output;

	public Run() {
		Input = new InputClass();
		One = new OneClass();
		Two = new TwoClass();
		Three = new ThreeClass();
		Four = new FourClass();
		Output = new OutputClass();
	}

	public void Control() {
		Input.InputNum();

		int type = Input.inputType();
		int[] number = Input.getNumber();
		int[] result = null;

		switch (type) { // 사용자가 선택한 함수 실행
		case 1:
			One.sum(number);
			result = One.getResult();
			break;
		case 2:
			Two.Most(number);
			result = Two.getResult();
			break;
		case 3:
			Three.oddeven(number);
			result = Three.getResult();
			break;
		case 4:
			Four.sort(number);
			result = Four.getResult();
			break;
		}

		Output.setNumber(result, type); // 사용자가 선택한 함수의 결과 출력
		Output.output();
	}

	public static void main(String[] args) {
		Run r = new Run();
		r.Control();
	}
}