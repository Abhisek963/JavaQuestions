package Array;

import java.util.Scanner;

public class SumSubArray {
    public static int minSub(int[] arr) {
        int target = 7;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
        	for(int j = i; j<arr.length;j++) {
        		sum+=arr[j];
        		if(sum>=target) {
        			int len = j - i + 1;
        			min = Math.min(min, len);
        			break;
        		}
              
            }
        }   
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = minSub(arr);
        System.out.println("Minimum Length = " + result);

    }
}