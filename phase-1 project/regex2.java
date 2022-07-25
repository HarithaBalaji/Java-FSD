1.

package regex;
import java.util.regex.*;  
	public class regex2{  
	public static void main(String args[]){  
		Pattern pa = Pattern.compile(".s"); 
		Matcher m = pa.matcher("as");  
		boolean b = m.matches();  
		boolean b2=Pattern.compile(".s").matcher("as").matches();  
		System.out.println(b+" "+b2); 
		  
	}}

2.

package regex;
import java.util.regex.*; 
class regex {
	 
		public static void main(String args[]){  
		System.out.println("?");  
		System.out.println(Pattern.matches("[xyz]?", "x"));  
		System.out.println("+");  
		System.out.println(Pattern.matches("[xyz]+", "x"));  
		System.out.println(Pattern.matches("[xyz]+", "xxx"));
		System.out.println("*");
		System.out.println(Pattern.matches("[xyz]*", "xyyyzx"));
		
	 }

	 

}


