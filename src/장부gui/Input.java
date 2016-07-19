package 장부gui;

import java.awt.*;
import java.awt.event.*;

public class Input extends Dialog implements ActionListener {
	private Label day, title, money, ex;
	private TextField[] day1, title1, money1, ex1;
	private String[] 날짜, 제목, 비고;
	private int[] 금액;
	private Button ok, cancel;

	public Input(Frame owner) {
		this(owner, true);
	}

	public Input(Frame owner, boolean modal) {
		super(owner, "입력창", modal);
		setSize(480, 580);
		setResizable(false);
		setLocation(500, 500);
		setLayout(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}
		});
		day = new Label("날짜");
		title = new Label("제목");
		money = new Label("금액");
		ex = new Label("비고");

		day1 = new TextField[10];
		title1 = new TextField[10];
		money1 = new TextField[10];
		ex1 = new TextField[10];
		ok = new Button("확인");
		cancel = new Button("취소");
		날짜 = new String[10];
		제목 = new String[10];
		금액 = new int[10];
		비고 = new String[10];

		ok.addActionListener(this);
		cancel.addActionListener(this);
		for (int i = 0; i < 10; i++) {
			day1[i] = new TextField();
			day1[i].setBounds(60, 70 + 35 * (i + 1), 70, 30);
			title1[i] = new TextField();
			title1[i].setBounds(160, 70 + 35 * (i + 1), 70, 30);
			money1[i] = new TextField();
			money1[i].setBounds(260, 70 + 35 * (i + 1), 70, 30);
			ex1[i] = new TextField();
			ex1[i].setBounds(360, 70 + 35 * (i + 1), 70, 30);
		}
		day1[0].setText("20160501");
		day1[1].setText("20160502");
		day1[2].setText("20160503");
		day1[3].setText("20160504");
		day1[4].setText("20160505");
		day1[5].setText("20160506");
		day1[6].setText("20160507");
		day1[7].setText("20160508");
		day1[8].setText("20160509");
		day1[9].setText("20160510");
		title1[0].setText("제목1");
		title1[1].setText("제목2");
		title1[2].setText("제목3");
		title1[3].setText("제목4");
		title1[4].setText("제목5");
		title1[5].setText("제목6");
		title1[6].setText("제목7");
		title1[7].setText("제목8");
		title1[8].setText("제목9");
		title1[9].setText("제목10");
		money1[0].setText("5000");
		money1[1].setText("6000");
		money1[2].setText("7000");
		money1[3].setText("8000");
		money1[4].setText("9000");
		money1[5].setText("10000");
		money1[6].setText("9000");
		money1[7].setText("8000");
		money1[8].setText("7000");
		money1[9].setText("6000");
		ex1[0].setText("비고");
		ex1[1].setText("비고");
		ex1[2].setText("비고");
		ex1[3].setText("비고");
		ex1[4].setText("비고");
		ex1[5].setText("비고");
		ex1[6].setText("비고");
		ex1[7].setText("비고");
		ex1[8].setText("비고");
		ex1[9].setText("비고");
		day.setBounds(80, 70, 60, 30);
		title.setBounds(180, 70, 60, 30);
		money.setBounds(280, 70, 60, 30);
		ex.setBounds(380, 70, 60, 30);

		ok.setBounds(300, 470, 60, 30);
		cancel.setBounds(370, 470, 60, 30);

		add(day);
		add(title);
		add(money);
		add(ex);
		add(ok);
		add(cancel);
		for (int i = 0; i < 10; i++) {
			add(day1[i]);
			add(title1[i]);
			add(money1[i]);
			add(ex1[i]);
		}

	}

	public void actionPerformed(ActionEvent e) {
		if ("확인".equals(e.getActionCommand())) {
			for (int i = 0; i < 10; i++) {
				날짜[i] = day1[i].getText();
				제목[i] = title1[i].getText();
				금액[i] = Integer.parseInt(money1[i].getText());
				비고[i] = ex1[i].getText();
			}
			setVisible(false);
		} else if ("취소".equals(e.getActionCommand())) {
			System.exit(0);
		}
	}

	public String[] get날짜() {
		return 날짜;
	}

	public String[] get제목() {
		return 제목;
	}

	public int[] get금액() {
		return 금액;
	}

	public String[] get비고() {
		return 비고;
	}

}
