class Table extends Thread{
	int num;
	Table(int num){
		this.num=num;
	}
	public void run() {
		System.out.println("table for "+num);
		for(int j=1;j<=10;j++) {
			System.out.println(num+"*"+j+"="+(num*j));
		}
	}
}
public class table{
	public static void main(String[] args) {
		Table t5=new Table(5);
		Table t10=new Table(10);
		Table t15=new Table(15);
		Table t20=new Table(20);
		t5.start();
		t10.start();
		t15.start();
		t20.start();
	}

}
