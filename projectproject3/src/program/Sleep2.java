package program;
public class Sleep2 {
private static Object object = new Object();
public static void main(String[] args) throws InterruptedException {
	System.out.println("Thread Going to sleep...");
	Thread.sleep(2000);
	System.out.println("Thread woke up ");
synchronized(object)
			{
				System.out.println("Thread wait...");
				//object.wait();
				object.wait(100);
			}
			
			System.out.println("Thread woken up after notify() or timeout.");


			
		}

	
		
	}

