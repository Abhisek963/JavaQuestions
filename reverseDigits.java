package numberprogram;

public class reverseDigits {

	public static int reverseDigit(int num) {
		int rev = 0;
		while(num!=0) {
			int ld = num % 10;
			rev = rev * 10 +     ld;
		    num = num / 10;
		}
		return rev;
	}
    public static void main(String [] args) {
    	System.out.println(reverseDigit(5321));
    
    }
}
