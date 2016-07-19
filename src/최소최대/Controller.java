package 최소최대;

public class Controller {
	private Input in;
	private Books bk;
	private Output out;

	public Controller() {
		in = new Input();
		bk = new Books();
		out = new Output();
	}

	public void 제어() {
		int 횟수;
		Contents 최소금액내역, 최대금액내역;

		in.입력();

		String[] 날짜 = in.get날짜();
		String[] 제목 = in.get제목();
		int[] 금액 = in.get금액();
		String[] 비고 = in.get비고();

		횟수 = in.get횟수();

		bk.내용생성(횟수, 날짜, 제목, 금액, 비고); // 입력받은 값 넣어주기

		bk.최소금액_찾기();
		bk.최대금액_찾기();

		최소금액내역 = bk.get최소금액내역();
		최대금액내역 = bk.get최대금액내역();

		out.최소금액출력(최소금액내역);
		out.최대금액출력(최대금액내역);

	}

	public static void main(String[] args) {
		Controller c = new Controller();
		c.제어();

	}
}