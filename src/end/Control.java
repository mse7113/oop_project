package end;

public class Control {
	private Action action;

	public Control() {
		action = new Action();
	}

	public void ����(String command) {
		action.setCommand(command);
		action.����();

	}

	public static void main(String[] args) {
		Control control = new Control();
		All all = new All(control);
	}
}
