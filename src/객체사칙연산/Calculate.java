package ��ü��Ģ����;

public class Calculate {
	private int ù��°, �ι�°, ���ü���, ���;

	public void setData(int ù��°, int �ι�°, int ���ü���) {
		this.ù��° = ù��°;
		this.�ι�° = �ι�°;
		this.���ü��� = ���ü���;
	}

	public void ��Ģ����() {
		switch (���ü���) { // ����ڰ� ������ �Լ� ����
		case 1:
			��� = ù��° + �ι�°;
			break;
		case 2:
			if (ù��° > �ι�°) {
				��� = ù��° - �ι�°;
			} else {
				��� = �ι�° - ù��°;
			}
			break;
		case 3:
			��� = ù��° * �ι�°;
			break;
		case 4:
			if (ù��° > �ι�°) {
				��� = ù��° / �ι�°;
			} else {
				��� = �ι�° / ù��°;
			}
			break;
		case 5:
			if (ù��° > �ι�°) {
				��� = ù��° % �ι�°;
			} else {
				��� = �ι�° % ù��°;
			}
			break;
		}

	}

	public int get���() {
		return ���;
	}
}
