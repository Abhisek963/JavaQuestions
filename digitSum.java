package numberprogram;

public class digitSum {
	public static int addDigits(int num) {
		int add = 0;
		while(num!=0) {
			int ld = num % 10;
			add = add + ld;
			num = num / 10;
		}
		return add;
	}
    public static void main(String [] args) {
    	System.out.println(addDigits(5321));
    }
}