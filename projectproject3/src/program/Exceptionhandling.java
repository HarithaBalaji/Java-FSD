package program;
public class Exceptionhandling {
		public static void main(String[] args) {
			try {
	            int a = 100, b = 0;
	            int c = a/b;  // cannot divide by 0
	            System.out.println ("Result = " + c);
	        }
	        catch(ArithmeticException e) {
	            System.out.println ("A number cannot divide by 0");
	        }
		}

	}

