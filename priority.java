class mythr extends Thread{
	public mythr(String name) {
		super(name);
	}
	public void run() {
		int i=1;
		while(i<=100) {
			System.out.println("i'm a thread");
			System.out.println(this.getName());
			i++;
		}
	}
}
public class priority {

	public static void main(String[] args) {
		mythr t1=new mythr("csw1");
		mythr t2=new mythr("csw2");
		mythr t3=new mythr("csw3");
		mythr t4=new mythr("csw4");
		mythr t5=new mythr("csw5 (most important)");
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
