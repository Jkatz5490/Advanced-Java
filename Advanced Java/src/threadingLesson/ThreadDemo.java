package threadingLesson;

public class ThreadDemo {
	public static void main(String[] args) {
		// Passing runnable instance
		Thread thread = new Thread(new MyThread());
		Thread thread1 = new Thread(new MyThread());
		// Calling start method
		// try
		// {
		thread.start();
		// thread.join();
		thread1.start();
		//thread1.join();
		// }
		// catch(InterruptedException itexc) {}
	}
}