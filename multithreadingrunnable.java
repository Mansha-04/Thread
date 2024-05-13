
public class multithreadingrunnable implements Runnable{
	public void run() {
		System.out.println("new thread is running");
	}

	public static void main(String[] args) {
		multithreadingrunnable m1=new multithreadingrunnable();
		Thread t1=new Thread(m1);
		t1.start();
	}

}
