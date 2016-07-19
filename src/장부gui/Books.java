package 장부gui;

import 장부gui.Contents;

public class Books {
	private String[] 날짜, 제목, 비고;
	private int[] 금액;

	private Contents[] c, 찾은내역;

	public void setData(String[] 날짜, String[] 제목, int[] 금액, String[] 비고) {
		this.날짜 = 날짜;
		this.제목 = 제목;
		this.금액 = 금액;
		this.비고 = 비고;

	}

	public void 내용생성() {
		c = new Contents[10];
		for (int i = 0; i < 10; i++) {
			c[i] = new Contents(날짜[i], 제목[i], 금액[i], 비고[i]);

		}

	}

	public void 날짜검색(String 검색날짜) {
		찾은내역 = new Contents[1];
		for (int i = 0; i < 10; i++) {
			if (c[i].get날짜().equals(검색날짜)) {
				찾은내역[0] = c[i];
			}
		}
	}

	public Contents[] get찾은내역() {
		return 찾은내역;
	}

}