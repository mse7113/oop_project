package 장부gui;

import java.awt.*;
import java.awt.event.*;

public class Find extends Dialog implements ActionListener {
	private Label 검색날짜;
	private TextField 검색날짜칸;
	private Button 확인;
	private String 입력날짜;

	public Find(Frame owner) {
		super(owner, "검색창", true);

		setLayout(null);
		setSize(400, 230);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		검색날짜 = new Label("검색날짜");
		검색날짜칸 = new TextField();

		확인 = new Button("확인");

		확인.addActionListener(this);
		검색날짜.setBounds(90, 100, 60, 30);

		검색날짜칸.setBounds(170, 100, 80, 30);
		확인.setBounds(290, 170, 60, 30);

		add(검색날짜);
		add(검색날짜칸);

		add(확인);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "확인") {
			입력날짜 = 검색날짜칸.getText();
			setVisible(false);
		}
	}

	public String get입력날짜() {
		return 입력날짜;
	}

}