package end;

public class Action {
	private String command;

	public void setCommand(String command) {
		this.command = command;
	}

	public void ����() {
		if (command.equals("01-1")) {
			�ϳ��Ǽ���.Process p = new �ϳ��Ǽ���.Process();
			p.����();
		} else if (command.equals("01-2")) {
			�ΰ��Ǽ���.Process p = new �ΰ��Ǽ���.Process();
			p.����();
		} else if (command.equals("01-3")) {
			�̸�����.Process p = new �̸�����.Process();
			p.����();
		} else if (command.equals("01-4")) {
			�μ����.Controller1 c = new �μ����.Controller1();
			c.start();
		} else if (command.equals("02")) {
			��ü��Ģ����.Control c = new ��ü��Ģ����.Control();
			c.����();
		} else if (command.equals("03-1")) {
			������.Process p = new ������.Process();
			p.����();
		} else if (command.equals("03-2")) {
			ū��������.Control c = new ū��������.Control();
			c.����();
		} else if (command.equals("03-3")) {
			ū�����.Control c = new ū�����.Control();
			c.����();
		} else if (command.equals("03-4")) {
			Ȧ��¦��.Control c = new Ȧ��¦��.Control();
			c.����();
		} else if (command.equals("04-1")) {
			��������.Run r = new ��������.Run();
			r.����();
		} else if (command.equals("04-2")) {
			����������ū��.Run r = new ����������ū��.Run();
			r.����();
		} else if (command.equals("04-3")) {
			������Ȧ¦.Run r = new ������Ȧ¦.Run();
			r.����();
		} else if (command.equals("04-4")) {
			������ū��.Run r = new ������ū��.Run();
			r.����();
		} else if (command.equals("04-5")) {
			����.Run run = new ����.Run();
			run.Control();
		} else if (command.equals("���ó��(�۹���)")) {
			�ּ��ִ�.Controller c = new �ּ��ִ�.Controller();
			c.����();
		} else if (command.equals("���ó��(GUI)")) {
			���gui.Control c = new ���gui.Control();
			c.����();
		} else if (command.equals("�ۼ��� ����")) {
			�ۼ�������.Output o = new �ۼ�������.Output();
			o.���();
		} else if (command.equals("�ۼ��� ����")) {
			�ۼ��ڳ���.Output o = new �ۼ��ڳ���.Output();
			o.���();
		} else if (command.equals("������")) {
			System.exit(0);
		}

	}
}
