package middle;

public class Control {
	private Input in;
	private Calcul cal;
	private Output out;

	public Control() {
		in = new Input();
		cal = new Calcul();
		out = new Output();

	}

	public void process() {
		in.inputNum();

		cal.calculNum(in.getMonth(), in.getDay());

		out.outputNum(cal.getDayNum(), cal.getSelectDay());
	}

}
