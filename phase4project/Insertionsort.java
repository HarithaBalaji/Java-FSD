package phase4project;
public class Insertionsort {  
    public static void insertionSort(int a[]) {  
        int n = a.length;  
        for (int j = 1; j < n; j++) {  
            int key = a[j];  
            int i = j-1;  
            while ( (i > -1) && ( a [i] > key ) ) {  
                a [i+1] = a [i];  
                i--;  
            }  
            a[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {120,20,1,201,75,86};    
        System.out.println("Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    


