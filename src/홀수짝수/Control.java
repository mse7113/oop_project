package Ȧ��¦��;

public class Control {
	private Input i;
	private Calculate c;
	private Output o;

	public Control() {
		i = new Input();
		c = new Calculate();
		o = new Output();
	}

	public void ����() {
		int ����, ¦�����, �Ǻ�;
		int[] Ȧ�����;
		do {
			i.�Է�();
			i.�Ǻ�();
			���� = i.get����();
			if (���� == 99) {
				o.����();
			} else {
				c.���(����);
				Ȧ����� = c.getȦ�����();
				¦����� = c.get¦�����();
				�Ǻ� = c.get�Ǻ�();
				if (�Ǻ� == 1) {
					o.Ȧ�����(����, Ȧ�����);
				} else {
					o.¦�����(¦�����);
				}
			}

		} while (���� != 99);
	}

	public static void main(String[] args) {
		Control c = new Control();
		c.����();
	}
}
