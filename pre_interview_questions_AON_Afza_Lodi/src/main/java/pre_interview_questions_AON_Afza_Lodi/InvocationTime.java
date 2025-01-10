package pre_interview_questions_AON_Afza_Lodi;

public class InvocationTime {

	private IncDec anyIncDec;

	public InvocationTime(IncDec anyIncDec) {
		this.anyIncDec = anyIncDec;
	}

	public long calculateTimeForInvocation() {
		long startTime, endTime, executionTime;
		startTime = System.nanoTime();
		anyIncDec.increment();
		endTime = System.nanoTime();
		executionTime = (endTime - startTime) / 1000000;
		System.out.println("Invocation Time for increment() is: " + executionTime + " milliseconds");
		startTime = System.nanoTime();
		anyIncDec.decrement();
		endTime = System.nanoTime();
		executionTime = (endTime - startTime) / 1000000;
		System.out.println("Invocation Time for decrement() is: " + executionTime + " milliseconds");
		return executionTime;
	}

}
