package map;
import java.util.*;
public class map {

		public static void main(String args[])
		{
			Map<String, Integer> hm = new HashMap<String, Integer>();
			hm.put("a",100);
			hm.put("b",200);
			hm.put("c",300);
			hm.put("d",400);
			for (Map.Entry<String, Integer> me :
				hm.entrySet()) {
	           System.out.print(me.getKey() + ":");
			   System.out.println(me.getValue());
			}
		
	Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  {  
	    ht.put(6,"isac");  
	    ht.put(7,"newt");  
	    System.out.println("\nThe elements of HashTable are ");  
	    for(Map.Entry n:ht.entrySet()){    
	    System.out.println(n.getKey()+" "+n.getValue());    
	}
	}
	TreeMap<Integer,String> map=new TreeMap<Integer,String>();    {
	    map.put(8,"school");    
	    map.put(9,"college");          
	    System.out.println("\nThe elements of TreeMap are ");  
	    for(Map.Entry l:map.entrySet()){    
	     System.out.println(l.getKey()+" "+l.getValue());    
	}   }
	}}







