
public class multithreadinggroup implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		multithreadinggroup runnable=new multithreadinggroup();
		ThreadGroup t=new ThreadGroup("my thread group");
		Thread t1=new Thread(t,runnable,"first thread");
		Thread t2=new Thread(t,runnable,"second thread");
		Thread t3=new Thread(t,runnable,"third thread");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("thread group name: "+t.getName());
		t.list();

	}

}
