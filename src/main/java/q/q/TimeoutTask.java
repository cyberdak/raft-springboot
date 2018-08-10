package q.q;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

public class TimeoutTask {
	private static ExecutorService executorService = Executors.newScheduledThreadPool(1, new ThreadFactoryBuilder().setNameFormat("timeout-%d").build());
	private static AtomicBoolean isTimeout = new AtomicBoolean(false);
	
	public static void startTimeout() {
		executorService.submit(new Runnable() {
			private int timeout = new Random().nextInt(150) + 150;
			@Override
			public void run() {
				
			}
		});
	}
}
