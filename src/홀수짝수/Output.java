package 홀수짝수;

public class Output {
	public void 홀수결과(int 숫자, int[] 홀수결과) {
		System.out.println(숫자 + " * " + 1 + " = " + 홀수결과[0]);
		System.out.println(숫자 + " * " + 2 + " = " + 홀수결과[1]);
		System.out.println(숫자 + " * " + 3 + " = " + 홀수결과[2]);
		System.out.println(숫자 + " * " + 4 + " = " + 홀수결과[3]);
		System.out.println(숫자 + " * " + 5 + " = " + 홀수결과[4]);
		System.out.println(숫자 + " * " + 6 + " = " + 홀수결과[5]);
		System.out.println(숫자 + " * " + 7 + " = " + 홀수결과[6]);
		System.out.println(숫자 + " * " + 8 + " = " + 홀수결과[7]);
		System.out.println(숫자 + " * " + 9 + " = " + 홀수결과[8]);
	}

	public void 짝수결과(int 짝수결과) {
		System.out.println("10배까지의 합은 " + 짝수결과 + " 입니다.");
	}

	public void 종료() {
		System.out.println("종료되었습니다.");
	}
}
