package constructor;
public class constructor {
		int id;
		String name;
		
	void display() {
		System.out.println(id+""+name);
	}
	}
	 class stud
	{
		public static void main(String[]args) {
			constructor c1=new constructor();
			constructor c2=new constructor();
			
			c1.display();
			c2.display();
		}
			
		}
	class student{
		int id;
		String name;
		
		student(int i,String N)
		{
			id=i;
		    name=N;
		}
		
		void display() {
			System.out.println(id+""+name);
		}
	}
	  class constructor1{
		public static void main(String[]args) {
		student st1=new student(9,"haritha");
		student st2=new student(10,"balaji");
		st1.display();
		st2.display();
		}
		}



