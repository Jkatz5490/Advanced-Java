package threadingLesson;

public class Syncro {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Sample fnew = new Sample();
		SyncroEx ss = new SyncroEx(fnew, "welcome");
		SyncroEx ss1 = new SyncroEx(fnew, "new");
		SyncroEx ss2 = new SyncroEx(fnew, "programmer");
	}
}