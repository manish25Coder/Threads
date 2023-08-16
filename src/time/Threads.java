package time;

public class Threads extends Thread {

	public static void main(String[] args) {
		Threads obj=new Threads();
		Armstrong obj1=new Armstrong();
		Prime obj2= new Prime();
		obj1.start();
		obj2.start();

	}

}
