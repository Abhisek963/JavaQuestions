package Array;

import java.util.Scanner;

public class AddArray {
	  public static int AddOfArr(int[] arr) {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	               sum = sum + arr[i];
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the array:");
	        int size = sc.nextInt();
	        int arr[] = new int[size];
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int result = AddOfArr(arr);
	        System.out.println("Add of elements = " + result);
	    }
}
