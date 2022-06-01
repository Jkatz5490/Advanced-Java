package threadingLesson;

public class ThreadDemo1 {
	public static void main(String[] args) {
		/*
		MyThread1 thread = new MyThread1();
		MyThread1 thread1 = new MyThread1();
		thread.start();
		thread1.start();
		System.out.println("-----------------");
		*/
		MyThread2 myThread = new MyThread2();
		MyThread2 myThread2 = new MyThread2();
		myThread.start();
		myThread2.start();
		
	}
}
class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Entered run method " + Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println("My Thread" + i);
		}
		System.out.println("Finished with MyThread1");
	}

}

class MyThread2 extends Thread{
	
	public void run() {
		System.out.println("Entered run method " + Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println("My Thread " + i);
		}
		System.out.println("Finished with MyThread1");
	}
}