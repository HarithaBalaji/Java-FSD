package phase4project;
	import java.util.Arrays;

	public class Expo {

	public static  void main(String[] args){

	    int[] a = {4,8,16,18,20};
	    int length= a.length;
	    int value = 18;
	    int outcome = exponentialSearch(a,length,value);
	    if(outcome<0){

	        System.out.println( "Element is not present in the array");

	     }else {

	         System.out.println( "Element is  present in the array at index :"+outcome);
	     }

	         }

	         public static int exponentialSearch(int[] a ,int length, int value ){

	         if(a[0]==value){
	             return 0;
	             }
	         int i=1;
	         while(i<length && a[i]<=value){

	             i=i*2;
	         }
	         return Arrays.binarySearch(a,i/2,Math.min(i,length),value);
	         }


	 }



