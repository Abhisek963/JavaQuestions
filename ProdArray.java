package Array;

import java.util.Scanner;

public class ProdArray {
    public static int prodOfArr(int[] arr) {
    	if(arr.length<=1)
    		return 0;
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                prod *= arr[i];
            }
        }
        return prod;
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
        int result = prodOfArr(arr);
        System.out.println("Product of odd elements = " + result);
    }
}