package 최소최대;

public class Contents {
	private String 날짜, 제목, 비고;
	private int 금액;

	public Contents(String 날짜, String 제목, int 금액, String 비고) {
		this.날짜 = 날짜;
		this.제목 = 제목;
		this.금액 = 금액;
		this.비고 = 비고;
	}

	public String get날짜() {
		return 날짜;
	}

	public String get제목() {
		return 제목;
	}

	public int get금액() {
		return 금액;
	}

	public String get비고() {
		return 비고;
	}

}