package 최소최대;

public class Books {

	private Contents[] c;
	private int 최소금액 = 655000;
	private int 최대금액 = -655000;
	private int 최소금액위치 = 0, 최대금액위치 = 0;

	public void 내용생성(int 횟수, String[] 날짜, String[] 제목, int[] 금액, String[] 비고) {
		c = new Contents[횟수];
		for (int i = 0; i < 횟수; i++) {
			c[i] = new Contents(날짜[i], 제목[i], 금액[i], 비고[i]);

		}
	}

	public void 최소금액_찾기() {
		for (int i = 0; i < c.length; i++) {
			if (최소금액 > c[i].get금액()) { // 작으면 바뀜
				최소금액 = c[i].get금액();
				최소금액위치 = i;
			}
		}
	}

	public void 최대금액_찾기() {
		for (int i = 0; i < c.length; i++) {
			if (최대금액 < c[i].get금액()) { // 크면 바뀜
				최대금액 = c[i].get금액();
				최대금액위치 = i;
			}
		}
	}

	public Contents get최소금액내역() {
		return c[최소금액위치];
	}

	public Contents get최대금액내역() {
		return c[최대금액위치];
	}

}
