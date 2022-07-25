package innerclass;
	class OuterClass {
		  String z = "PROGRAMMING.";

		  class InnerClass {
		    public String myInnerMethod() {
		      return z;
		    }
		  }
		}
	abstract class cat{
		abstract void color();
	}
public class innerclass {
public static void main(String[] args) {
			OuterClass myOuter = new OuterClass();
		    OuterClass.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.myInnerMethod());
		    
		    cat CAT=new cat() { //anonymous class
		    	void color() {
		    		System.out.println("COLOR.");
		    	}
		    };
		    
		CAT.color();	
		}

	}


