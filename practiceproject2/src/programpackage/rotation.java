package programpackage;
import java.util.Arrays;
public class rotation {
	
	public static void rightRotate(int[] a)
    {
        int last = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
 
        a[0] = last;
    }
 
    public static void rightRotate(int[] a, int k)
    {
                if (k < 0 || k >= a.length) {
            return;
        }
 
        for (int i = 0; i < k; i++) {
            rightRotate(a);
        }
    }
    
	public static void main(String[] args) {
		 int[] a = { 1, 2, 3, 4, 5,6,7};
	        int k = 5;
	 
	        rightRotate(a, k);
	 
	        System.out.println(Arrays.toString(a));
	    
	    
	}

}