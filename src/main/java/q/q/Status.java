package q.q;

import java.util.concurrent.atomic.AtomicInteger;

public class Status {
	// follewer = 0
	// can = 1 
	// leader = 1
	private static int status = 0;
	private static AtomicInteger term = new AtomicInteger(0);

	public static int getStatus() {
		return status;
	}

	public static void setStatus(int status) {
		Status.status = status;
	}
	
	
}
