package 객체사칙연산;

public class Control {
	private Input i;
	private Calculate c;
	private Output o;

	public Control() {
		i = new Input();
		c = new Calculate();
		o = new Output();
	}

	public void 실행() {
		int 첫번째, 두번째, 선택숫자, 결과;
		i.입력();
		첫번째 = i.get첫번째();
		두번째 = i.get두번째();
		선택숫자 = i.get선택숫자();
		c.setData(첫번째, 두번째, 선택숫자);
		c.사칙연산();
		결과 = c.get결과();
		o.출력(결과);

	}

	public static void main(String[] args) {
		Control c = new Control();
		c.실행();
	}
}
