package collection;
import java.util.*;
	public class collection {
	public static void main(String[] args) {
			
			System.out.println("ArrayList:");
			ArrayList<String> place=new ArrayList<String>();   
		      place.add("mysore");//
		      place.add("tamilnadu");    	   
		      System.out.println(place);  
		    
		      System.out.println("\n");
		      System.out.println("Vector:");
		      Vector<Integer> vec =new Vector();
		      vec.addElement(20); 
		      vec.addElement(30); 
		      System.out.println(vec);
			
			
		      System.out.println("\n");
		      System.out.println("LinkedList:");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("lion");  
		      names.add("elephant");  	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		 
		       System.out.println("\n");
		       System.out.println("HashSet:");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(16);  
		       set.add(10);  
		       set.add(11);
		       set.add(14);
		       System.out.println(set);
		       
		       
		       System.out.println("\n");
		       System.out.println("LinkedHashSet:");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(11);  
		       set2.add(13);  
		       set2.add(17);
		       set2.add(15);	       
		       System.out.println(set2);
		      	} 
	}}






