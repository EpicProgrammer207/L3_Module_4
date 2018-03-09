package threads;

public class ThreadedReverseGreeting {
	public static void main(String[] args) {
		ThreadedReverseGreeting thread = new ThreadedReverseGreeting();
		thread.threadCreator(1);
	}

	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
	public void threadCreator(int i) {
		Thread t;
		if (i < 50 ) {
			threadCreator(i + 1);
		} 
			t = new Thread(() -> System.out.println("Hello from thread " + i + "!"));
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
