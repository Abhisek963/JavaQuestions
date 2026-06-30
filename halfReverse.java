package Array;

import java.util.Arrays;
import java.util.Scanner;

public class halfReverse {

    public static void halfRevOfArr(int[] arr) {
        int start = 0;
        int end;
        if(arr.length % 2==0)
           end = arr.length / 2 -1;
        else
        	end = arr.length/2;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
        System.out.println("Half Reversed Array: " + Arrays.toString(arr));
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
        halfRevOfArr(arr);
    }
}