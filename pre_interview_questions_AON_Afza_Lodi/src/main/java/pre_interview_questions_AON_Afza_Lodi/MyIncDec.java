package pre_interview_questions_AON_Afza_Lodi;

public class MyIncDec implements IncDec {

	private int x;

	public MyIncDec(int x) {
		this.x = x;
	}

	@Override
	public void increment() {
		this.x++;
	}

	@Override
	public void decrement() {
		this.x--;
	}

	public static void main(String args[]) {
		MyIncDec anyIncDec = new MyIncDec(10);
		InvocationTime invocationTime = new InvocationTime(anyIncDec);
		invocationTime.calculateTimeForInvocation();
	}
}
