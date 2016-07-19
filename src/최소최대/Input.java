package 최소최대;

import java.util.Scanner;

public class Input {
	Scanner sc;
	private String[] 날짜, 제목, 비고;
	private int[] 금액;
	private int 횟수 = 0;

	public Input() {
		sc = new Scanner(System.in);
	}

	public void 입력() {
		String[] 임시날짜 = new String[100]; // 100만큼의 크기선언
		String[] 임시제목 = new String[100];
		String[] 임시비고 = new String[100];
		int[] 임시금액 = new int[100];

		int 선택 = 0;
		while (선택 == 0) { // 계속 입력될수있도록 반복 1이면 벗어남
			System.out.println("날짜를 입력하세요.");
			임시날짜[횟수] = sc.next();
			System.out.println("제목을 입력하세요.");
			임시제목[횟수] = sc.next();
			System.out.println("금액을 입력하세요.");
			임시금액[횟수] = sc.nextInt();
			sc.nextLine();
			System.out.println("비고를 입력하세요.");
			임시비고[횟수] = sc.nextLine();
			횟수++;
			System.out.println("입력하시려면 0, 찾으시려면 1 을 입력하세요.");
			선택 = sc.nextInt();
		}
		날짜 = new String[횟수];
		제목 = new String[횟수];
		비고 = new String[횟수];
		금액 = new int[횟수];

		for (int i = 0; i < 횟수; i++) { // 입력받은 값으로 배열 생성
			날짜[i] = 임시날짜[i];
			제목[i] = 임시제목[i];
			금액[i] = 임시금액[i];
			비고[i] = 임시비고[i];
		}
	}

	// 넘겨주기
	public String[] get날짜() {
		return 날짜;
	}

	public String[] get제목() {
		return 제목;
	}

	public String[] get비고() {
		return 비고;
	}

	public int[] get금액() {
		return 금액;
	}

	public int get횟수() {
		return 횟수;
	}

}
