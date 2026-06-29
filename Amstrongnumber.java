package numberprogram;

public class Amstrongnumber {
	public static int countDigits(int num) {
		int count = 0;
		while(num!=0) {
			count++;
			num = num / 10;
		}
		return count;
	}
	public static int powerDigits(int base, int expo) {
		int res = 1;
		while(expo > 0) {
			res = res * base;
			expo --;
		}
		return res;
	}
	public static boolean isAmstrong(int num) {
		int original = num;
        int count = countDigits(num);
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + powerDigits(digit, count);
            num = num / 10;
        }
        return sum == original;
    }
	public static void main(String[] args) {
        int num = 153;
        if (isAmstrong(num))
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is Not an Armstrong Number");
    }
}

