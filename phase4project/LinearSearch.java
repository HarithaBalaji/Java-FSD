package phase4project;
import java.util.Scanner;

	public class LinearSearch {

	    public static void main(String[] args){

	        int[] a = {100,200,300,400,500};

	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the element to be searched");
	        int searchValue = s.nextInt();


            int result = (int) linearing(a,searchValue);

            if(result==-1){

                System.out.println("Element not in the array");
            } else {

                System.out.println("Element found at "+result+" and the search key is "+a[result]);
            }


        }




public static int linearing(int a[], int x) {

    int arrlength = a.length;
    for (int i = 0; i < arrlength - 1; i++) {

        if (a[i] == x) {

            return i;

         }
     }

            return -1;

   }

}

