package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseingArray {
    public static void revOfArr(int[] arr) {
    	int[] arr2 = new int[arr.length];
    	int i = arr.length-1;
    	for(int j=0; j<arr.length;j++) {
    		arr2[j]=arr[i];
    		i--;
    	}
    	System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Array elements are:"+ Arrays.toString(arr));
        System.out.print("Reverse Array: ");
        revOfArr(arr);
    }
}