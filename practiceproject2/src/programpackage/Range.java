package programpackage;
public class Range {
	    static int b= 16;
	    static int N = 100000; 
	    static long table[][] = new long[N][b + 1]; 
	    static void buildSparseTable(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            table[i][0] = arr[i]; 
	        for (int j = 1; j <= b; j++) 
	            for (int i = 0; i <= n - (1 << j); i++) 
	                table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1]; 
	    } 
	    static long query(int L, int R) 
	    {
	        long answer = 0; 
	        for (int j =b; j >= 0; j--)  
	        { 
	            if (L + (1 << j) - 1 <= R)  
	            { 
	                answer = answer + table[L][j];
	                L += 1 << j; 
	            } 
	        } 
	        return answer; 
	    }
	    public static void main(String args[]) 
	    { 
	        int arr[] = { 2,3,1,9,8,7 }; 
	        int n = arr.length; 
	        buildSparseTable(arr, n); 
	        System.out.println(query(0, 2)); 
	        System.out.println(query(1, 5)); 
	        System.out.println(query(4, 3)); 
	    } 
	}




