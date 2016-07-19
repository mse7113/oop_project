package end;

import java.awt.*;
import java.awt.event.*;

public class All extends Frame implements ActionListener {
	private MenuBar bar;
	private Menu m1, m2, m3, m4, m5, m6;
	private String command;
	private Control control;

	public All(Control control) {
		super("����");
		this.control = control;

		bar = new MenuBar();
		m1 = new Menu("����");
		m2 = new Menu("01");
		m3 = new Menu("0203");
		m4 = new Menu("04");
		m5 = new Menu("05");
		m6 = new Menu("����");
		m1.add("�ҷ�����");
		m1.add("-");
		m1.add("�����ϱ�");
		m1.add("-");
		m1.add("������");

		m2.add("01-1");
		m2.add("-");
		m2.add("01-2");
		m2.add("-");
		m2.add("01-3");
		m2.add("-");
		m2.add("01-4");

		m3.add("02");
		m3.add("-");
		m3.add("03-1");
		m3.add("-");
		m3.add("03-2");
		m3.add("-");
		m3.add("03-3");
		m3.add("-");
		m3.add("03-4");

		m4.add("04-1");
		m4.add("-");
		m4.add("04-2");
		m4.add("-");
		m4.add("04-3");
		m4.add("-");
		m4.add("04-4");
		m4.add("-");
		m4.add("04-5");

		m5.add("���ó��(�۹���)");
		m5.add("-");
		m5.add("���ó��(GUI)");
		m6.add("�ۼ��� ����");
		m6.add("-");
		m6.add("�ۼ��� ����");

		bar.add(m1);
		bar.add(m2);
		bar.add(m3);
		bar.add(m4);
		bar.add(m5);
		bar.add(m6);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}
		});

		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
		m5.addActionListener(this);
		m6.addActionListener(this);
		this.setMenuBar(bar);
		setSize(300, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		command = e.getActionCommand();
		control.����(command);
	}
}
