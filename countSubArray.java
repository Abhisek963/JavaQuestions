package Array;

import java.util.Scanner;

public class countSubArray {
    public static int countSub(int[] arr) {
    	int k = 4;
    	int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
        	int count=0;
            for (int j = i; j < i + k; j++) {
                if(arr[j]%2!=0) 
                	count++;
            }
            max = Math.max(count, max);
            
        }
        return max;
        
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
        int result = countSub(arr);
        System.out.println("Count = " + result);

    }
}
