package strings;

public class strings {
public static void main(String[] args) {
			String s=new String("programming");
			System.out.println(s.length());
			
			String s1=new String("computer");
			System.out.println(s1.substring(2));
			
			String s2="iava";
			String s11="java";
			System.out.println(s2.compareTo(s11));
			
			String s4="hello";
			System.out.println(s4.toLowerCase());
			
			String sm="iava";
			String rep=s.replace('i', 'j');
			System.out.println(rep);
			
			String equ="super program";
			String als="super PROgram";
			System.out.println(equ.equals(als));
			
			System.out.print("\n");
	        System.out.println("stringBuffer");
	        StringBuffer buff=new StringBuffer("stringescape");
	        buff.append("is more important.");
	        System.out.println(buff);
	        
	        StringBuffer b=new StringBuffer("tilcome");
	        b.replace(0,1,"we");
	        System.out.println(b);
	        
	        b.delete(0, 1);
	        System.out.println(b);
	        
	        System.out.print("\n");
	        StringBuilder d=new StringBuilder("camera");
	        d.append("is more important.");
	        System.out.println(d);
	        
	        System.out.println(d.delete(0, 2));
	        System.out.println(d.reverse());
	        
	        String all=("welcome all");   
	        
	        StringBuffer buff1=new StringBuffer(all);
	        System.out.println(buff.reverse());
	        
	        StringBuilder d1=new StringBuilder(all);
	        System.out.println(d.reverse());
	        
	        
	        
	        
		}

	}


