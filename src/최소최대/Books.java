package �ּ��ִ�;

public class Books {

	private Contents[] c;
	private int �ּұݾ� = 655000;
	private int �ִ�ݾ� = -655000;
	private int �ּұݾ���ġ = 0, �ִ�ݾ���ġ = 0;

	public void �������(int Ƚ��, String[] ��¥, String[] ����, int[] �ݾ�, String[] ���) {
		c = new Contents[Ƚ��];
		for (int i = 0; i < Ƚ��; i++) {
			c[i] = new Contents(��¥[i], ����[i], �ݾ�[i], ���[i]);

		}
	}

	public void �ּұݾ�_ã��() {
		for (int i = 0; i < c.length; i++) {
			if (�ּұݾ� > c[i].get�ݾ�()) { // ������ �ٲ�
				�ּұݾ� = c[i].get�ݾ�();
				�ּұݾ���ġ = i;
			}
		}
	}

	public void �ִ�ݾ�_ã��() {
		for (int i = 0; i < c.length; i++) {
			if (�ִ�ݾ� < c[i].get�ݾ�()) { // ũ�� �ٲ�
				�ִ�ݾ� = c[i].get�ݾ�();
				�ִ�ݾ���ġ = i;
			}
		}
	}

	public Contents get�ּұݾ׳���() {
		return c[�ּұݾ���ġ];
	}

	public Contents get�ִ�ݾ׳���() {
		return c[�ִ�ݾ���ġ];
	}

}
