package program;
	interface cycle{
		public default void color() {
			System.out.println("Car color is : blue");
		}
	}
	interface Sportcycle {
		public default void color() { 
		System.out.println("Sport car: Black");
		}
	}
	public class vehicle implements cycle,Sportcycle {
	    public void color() {
	    	cycle.super.color();
	    	Sportcycle.super.color();
	    }
		public static void main(String[] args) {
			vehicle diamond=new vehicle();
			diamond.color();
		}

	}


