package 장부gui;

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

	public void 제어() {
		String[] 날짜, 제목, 비고;
		int[] 금액;
		String 입력날짜;
		Contents[] 찾은내역;

		in.setVisible(true);

		날짜 = in.get날짜();
		제목 = in.get제목();
		금액 = in.get금액();
		비고 = in.get비고();

		bk.setData(날짜, 제목, 금액, 비고);
		bk.내용생성();
		find.setVisible(true);
		입력날짜 = find.get입력날짜();

		bk.날짜검색(입력날짜);
		찾은내역 = bk.get찾은내역();
		out.setData(찾은내역);
		out.출력();
		out.setVisible(true);

	}

	public static void main(String[] args) {
		Control c = new Control();
		c.제어();
	}

}
