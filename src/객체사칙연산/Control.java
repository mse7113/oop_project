package ��ü��Ģ����;

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
		int ù��°, �ι�°, ���ü���, ���;
		i.�Է�();
		ù��° = i.getù��°();
		�ι�° = i.get�ι�°();
		���ü��� = i.get���ü���();
		c.setData(ù��°, �ι�°, ���ü���);
		c.��Ģ����();
		��� = c.get���();
		o.���(���);

	}

	public static void main(String[] args) {
		Control c = new Control();
		c.����();
	}
}
