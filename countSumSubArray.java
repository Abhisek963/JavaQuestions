package Array;

import java.util.Scanner;

public class countSumSubArray {
	   public static int sumSub(int[] arr) {
	        int target = 7;
	        int count = 0;
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < arr.length; i++) {
	            int sum = 0;
	        	for(int j = i; j<arr.length;j++) {
	        		sum+=arr[j];
	        		if(sum<target) {
	        			int len = j - i + 1;
	        			max = Math.max(max, len);
	        			count++;
	        		}
	              
	            }
	        }   
	        return count;
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
	        int result = sumSub(arr);
	        System.out.println("Count = " + result);

	    }
}
