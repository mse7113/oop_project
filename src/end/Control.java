package end;

public class Control {
	private Action action;

	public Control() {
		action = new Action();
	}

	public void 제어(String command) {
		action.setCommand(command);
		action.실행();

	}

	public static void main(String[] args) {
		Control control = new Control();
		All all = new All(control);
	}
}
