package threadingLesson;

class MyThread implements Runnable {
	/* Thread.start(); runs this method*/
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Entered run method: " + Thread.currentThread().getName());
		}
		System.out.println("Finished with MyThread");
	}
}
