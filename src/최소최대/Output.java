package 최소최대;

public class Output {
	public void 최소금액출력(Contents c) {
		System.out.println("최소금액 : " + c.get날짜() + "\t" + c.get제목() + "\t" + c.get금액() + "\t" + c.get비고());

	}

	public void 최대금액출력(Contents c) {
		System.out.println("최대금액 : " + c.get날짜() + "\t" + c.get제목() + "\t" + c.get금액() + "\t" + c.get비고());
	}

}
