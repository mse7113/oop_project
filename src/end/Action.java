package end;

public class Action {
	private String command;

	public void setCommand(String command) {
		this.command = command;
	}

	public void 실행() {
		if (command.equals("01-1")) {
			하나의숫자.Process p = new 하나의숫자.Process();
			p.실행();
		} else if (command.equals("01-2")) {
			두개의숫자.Process p = new 두개의숫자.Process();
			p.실행();
		} else if (command.equals("01-3")) {
			이름나이.Process p = new 이름나이.Process();
			p.실행();
		} else if (command.equals("01-4")) {
			두수계산.Controller1 c = new 두수계산.Controller1();
			c.start();
		} else if (command.equals("02")) {
			객체사칙연산.Control c = new 객체사칙연산.Control();
			c.실행();
		} else if (command.equals("03-1")) {
			구구단.Process p = new 구구단.Process();
			p.실행();
		} else if (command.equals("03-2")) {
			큰수작은수.Control c = new 큰수작은수.Control();
			c.실행();
		} else if (command.equals("03-3")) {
			큰순출력.Control c = new 큰순출력.Control();
			c.실행();
		} else if (command.equals("03-4")) {
			홀수짝수.Control c = new 홀수짝수.Control();
			c.제어();
		} else if (command.equals("04-1")) {
			여러개합.Run r = new 여러개합.Run();
			r.제어();
		} else if (command.equals("04-2")) {
			여러개제일큰수.Run r = new 여러개제일큰수.Run();
			r.제어();
		} else if (command.equals("04-3")) {
			여러개홀짝.Run r = new 여러개홀짝.Run();
			r.제어();
		} else if (command.equals("04-4")) {
			여러개큰순.Run r = new 여러개큰순.Run();
			r.제어();
		} else if (command.equals("04-5")) {
			선택.Run run = new 선택.Run();
			run.Control();
		} else if (command.equals("장부처리(글문서)")) {
			최소최대.Controller c = new 최소최대.Controller();
			c.제어();
		} else if (command.equals("장부처리(GUI)")) {
			장부gui.Control c = new 장부gui.Control();
			c.제어();
		} else if (command.equals("작성자 정보")) {
			작성자정보.Output o = new 작성자정보.Output();
			o.출력();
		} else if (command.equals("작성자 논평")) {
			작성자논평.Output o = new 작성자논평.Output();
			o.출력();
		} else if (command.equals("끝내기")) {
			System.exit(0);
		}

	}
}
