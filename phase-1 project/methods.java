package methods1;

public class methods {
		public static void main(String [] args)  
		{  
			  
		methods obj = new methods();  
		   
		System.out.println("The sum is: "+obj.add(22, 44)); 
		System.out.println("The diff is:"+obj.sub(44, 22));
		}  
		int a;  
			 
		public int add(int a, int b)  
		{  
		a= a+b;  
			
		return a;  
		} 
		public int sub(int a,int b) 
		{
			
		b=a-b;

		return b;
		}
		}

