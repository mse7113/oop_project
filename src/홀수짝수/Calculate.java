package Ȧ��¦��;

public class Calculate {
	private int[] Ȧ�����;
	private int ¦�����, �Ǻ�;

	public Calculate() {
		Ȧ����� = new int[9];
	}

	public void ���(int ����) {
		if (���� % 2 == 1) {
			for (int i = 0; i < 9; i++) {
				Ȧ�����[i] = ���� * (i + 1);
			}
			�Ǻ� = 1;
		} else {
			for (int i = 1; i <= ���� * 10; i++) {
				¦����� = ¦����� + i;
			}
			�Ǻ� = 2;
		}
	}

	public int[] getȦ�����() {
		return Ȧ�����;
	}

	public int get¦�����() {
		return ¦�����;
	}

	public int get�Ǻ�() {
		return �Ǻ�;
	}
}
