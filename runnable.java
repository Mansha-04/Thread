class RunnableInterface1 implements Runnable{
	public void run() {
		int i=1;
		while(i<=1000) {
			System.out.println("thread 1");
			i++;
		}
	}
}
class RunnableInterface2 implements Runnable{
	public void run() {
		int i=1;
		while(i<=1000) {
			System.out.println("thread 2");
			i++;
		}
	}
}
public class runnable {

	public static void main(String[] args) {
		RunnableInterface1 r1=new RunnableInterface1();
		RunnableInterface2 r2=new RunnableInterface2();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}

}
