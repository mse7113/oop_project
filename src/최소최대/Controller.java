package �ּ��ִ�;

public class Controller {
	private Input in;
	private Books bk;
	private Output out;

	public Controller() {
		in = new Input();
		bk = new Books();
		out = new Output();
	}

	public void ����() {
		int Ƚ��;
		Contents �ּұݾ׳���, �ִ�ݾ׳���;

		in.�Է�();

		String[] ��¥ = in.get��¥();
		String[] ���� = in.get����();
		int[] �ݾ� = in.get�ݾ�();
		String[] ��� = in.get���();

		Ƚ�� = in.getȽ��();

		bk.�������(Ƚ��, ��¥, ����, �ݾ�, ���); // �Է¹��� �� �־��ֱ�

		bk.�ּұݾ�_ã��();
		bk.�ִ�ݾ�_ã��();

		�ּұݾ׳��� = bk.get�ּұݾ׳���();
		�ִ�ݾ׳��� = bk.get�ִ�ݾ׳���();

		out.�ּұݾ����(�ּұݾ׳���);
		out.�ִ�ݾ����(�ִ�ݾ׳���);

	}

	public static void main(String[] args) {
		Controller c = new Controller();
		c.����();

	}
}