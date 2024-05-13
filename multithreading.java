
public class multithreading extends Thread{
	public void run() {
		System.out.println("new thread is running");
	}

	public static void main(String[] args) {
		multithreading m1=new multithreading();
		m1.start();
	}

}
