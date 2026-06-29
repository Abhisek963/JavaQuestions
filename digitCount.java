package numberprogram;

public class digitCount {
	public static int countDigits(int num) {
		int count = 0;
		while(num!=0) {
			count++;
			num = num / 10;
		}
		return count;
	}
    public static void main(String [] args) {
    	System.out.println(countDigits(530));
    
}
}