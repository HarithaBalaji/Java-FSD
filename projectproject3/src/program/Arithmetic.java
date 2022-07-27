package program;
public class Arithmetic {
		 static void method() throws ArithmeticException  
		    {  
		        System.out.println("Thorws method");  
		        throw new ArithmeticException("throwing ArithmeticException");  
		    }  
		public static void main(String[] args) {
			 try  
		        {  
		            method();
		        }  
		        catch(ArithmeticException e)  
		        {  
		            System.out.println("main() method");  
		        } 
			 finally {
				 System.out.println("Final Block");
			 }
			
		}

	}


