
public class multithreadingsleep extends Thread{
	public void run() {
		for(int i=1;i<4;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		multithreadingsleep m1=new multithreadingsleep();
		multithreadingsleep m2=new multithreadingsleep();
		m1.start();
		m2.start();

	}

}
