package Array;

import java.util.Scanner;

public class minSubArray {
    public static int minSub(int[] arr) {
        int k = 3;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            System.out.print(sum + " ");
            if(sum<min) {
            	min = sum;
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
        System.out.println("Minimum Sum = " + result);
    }
}
