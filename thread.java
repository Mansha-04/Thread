class mythread1 extends Thread{
	public void run() {
		int i=1;
		while(i<=10000) {
			System.out.println("first thread");
			i++;
		}
	}
}
class mythread2 extends Thread{
	public void run() {
		int i=1;
		while(i<=10000) {
			System.out.println("second thread");
			i++;
		}
	}
}
public class thread {

	public static void main(String[] args) {
		mythread1 t1=new mythread1();
		mythread2 t2=new mythread2();
		t1.start();
		t2.start();
	}

}
