package threadingLesson;

class Sample {
	public void display(String msg) {
		System.out.print(msg + " ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("]");
	}
}

class SyncroEx extends Thread {
	String msg;
	Sample fobj;

	SyncroEx(Sample fp, String str) {
		fobj = fp;
		msg = str;
		start();
	}

	public void run() {
		fobj.display(msg);
	}
}
