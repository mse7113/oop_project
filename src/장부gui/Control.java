package ���gui;

import java.awt.*;;

public class Control extends Frame {
	private Input in;
	private Find find;
	private Books bk;
	private Output out;

	public Control() {
		in = new Input(this);
		find = new Find(this);
		bk = new Books();
		out = new Output(this);
	}

	public void ����() {
		String[] ��¥, ����, ���;
		int[] �ݾ�;
		String �Է³�¥;
		Contents[] ã������;

		in.setVisible(true);

		��¥ = in.get��¥();
		���� = in.get����();
		�ݾ� = in.get�ݾ�();
		��� = in.get���();

		bk.setData(��¥, ����, �ݾ�, ���);
		bk.�������();
		find.setVisible(true);
		�Է³�¥ = find.get�Է³�¥();

		bk.��¥�˻�(�Է³�¥);
		ã������ = bk.getã������();
		out.setData(ã������);
		out.���();
		out.setVisible(true);

	}

	public static void main(String[] args) {
		Control c = new Control();
		c.����();
	}

}
