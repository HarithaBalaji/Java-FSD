package programpackage;
public class Smallestnumber {
public void sort(int a[])  
		{  
		int size = a.length;  
		  
		for(int i = 0; i < size; i++)  
		{  
		int temp = i;  
		for(int j = i + 1; j < size; j++)  
		{  
		if(a[temp] > a[j])  
		{  
		temp = j;  
		}   
	}    
		if(temp != i)  
		{  
		    int t = a[i];  
		    a[i] = a[temp];  
		    a[temp] = t;   
		}  
		}  
		}   
	public int findKthSmallest(int a[], int k)  
		{  
		sort(a);  
		return a[k - 1];  
	}

		public static void main(String[] args) {
			
			Smallestnumber obj = new Smallestnumber();  
			  
			  
			int a1[] = {6,5,8,3,1};  
			  
			int size = a1.length;  
			int k = 4;  
			  
			System.out.println("For the array: ");  
			for(int i = 0; i < size; i++)  
			{  
			System.out.print(a1[i] + " ");  
			}  
			  
			int ele = obj.findKthSmallest(a1, k);  
			  
			System.out.println();  
			System.out.println("The " + k + "th smallest element of the array is: " + ele);  

		}

	}

