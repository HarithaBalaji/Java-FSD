package program;
public class Mythread extends Thread {

	public void run() {
		System.out.println("Thread class...");
	}
	public static void main(String[] args) {
		Mythread mythread=new Mythread();
		mythread.run();
		
	}

}