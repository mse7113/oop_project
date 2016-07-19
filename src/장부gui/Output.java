package 장부gui;

import java.awt.*;
import java.awt.event.*;

public class Output extends Dialog implements ActionListener {
	private Label day, title, money, ex;
	private TextField day1, title1, money1, ex1;
	private Button ok;
	private String 날짜, 제목, 금액, 비고;

	public Output(Frame owner) {
		this(owner, true);
	}

	public Output(Frame owner, boolean modal) {
		super(owner, "출력창", modal);

		setLayout(null);
		setSize(480, 270);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}
		});

		day = new Label("날 짜");
		title = new Label("제 목");
		money = new Label("금 액");
		ex = new Label("비 고");
		day1 = new TextField();
		title1 = new TextField();
		money1 = new TextField();
		ex1 = new TextField();

		ok = new Button("확인");

		ok.addActionListener(this);
		day.setBounds(80, 90, 60, 30);
		title.setBounds(180, 90, 60, 30);
		money.setBounds(280, 90, 60, 30);
		ex.setBounds(380, 90, 60, 30);

		day1.setBounds(60, 125, 70, 30);
		title1.setBounds(160, 125, 70, 30);
		money1.setBounds(260, 125, 70, 30);
		ex1.setBounds(360, 125, 70, 30);
		ok.setBounds(365, 200, 60, 30);

		add(day);
		add(title);
		add(money);
		add(ex);
		add(day1);
		add(title1);
		add(money1);
		add(ex1);

		add(ok);

	}

	public void setData(Contents[] 찾은내역) {
		날짜 = 찾은내역[0].get날짜();
		제목 = 찾은내역[0].get제목();
		금액 = Integer.toString(찾은내역[0].get금액());
		비고 = 찾은내역[0].get비고();
	}

	public void 출력() {
		day1.setText(날짜);
		title1.setText(제목);
		money1.setText(금액);
		ex1.setText(비고);
	}

	public void actionPerformed(ActionEvent e) {
		if ("확인".equals(e.getActionCommand())) {
			System.exit(0);
			;
		}
	}
}
