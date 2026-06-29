package numberprogram;

public class numberCheck {
	public static boolean numberChecker(int num) {
		int extremeSum = 0;
		int midSum = 0;
		extremeSum = num % 10;
		num /=10;
		
		while(num>=10) {
			int ld = num % 10;
			midSum += ld;
			num /= 10;
		}
		extremeSum += num;
		
		return extremeSum == midSum;
	}
    public static void main(String [] args) {
    	
    	    System.out.println(numberChecker(11245));
}
}
