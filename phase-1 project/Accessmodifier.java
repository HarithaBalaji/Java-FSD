1.Private Access modifier:

class privateAccessmodifier2 {
		private String name;
		public String getName() {
			return this.name;
		}
	public void setName(String name) {
		this.name=name;
	}
	}
	public class Accessmodifier{
		public static void main(String[]args) {
			privateAccessmodifier2 p=new privateAccessmodifier2();
			p.setName("private modifier");
			System.out.println(p.getName());
				}
			}
			


2.Public Access Modifier:
public class accessspecifier2 {
		public static void main(String[]args) {
			nam m=new nam();
			m.message();
		}

	}
	class nam{
		void message() {
			System.out.println("message");
		}
	}
3.Default access modifier:
public class accessspecifier2 {
		public static void main(String[]args) {
			nam m=new nam();
			m.message();
		}

	}
	class nam{
		void message() {
			System.out.println("message");
		}
	}



4.protected access specifier:

public class accessmodifier3 {
	class Birds{
		protected void display() {
			System.out.println("message");
		}
	}
	public class accessModifier extends Birds {

		public static void main(String[] args) {
			accessmodifier3 am=new accessmodifier3();
			 am.display();
		

		}}

