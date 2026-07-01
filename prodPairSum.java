package Array;

import java.util.Arrays;
import java.util.Scanner;

public class prodPairSum {
    public static int[] prodPairs(int[] arr) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int prod = arr[i] * arr[j];
                if (prod%2!=0) 
                    count++;   
                if(prod>max)
                	max=prod; 	
            }
                        
        }
        return new int[] {count,max};
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
        int[] result = prodPairs(arr);
        System.out.println(Arrays.toString(result));
        
    }
}
