package numberprogram;

public class powerNumber {
	public static int powerDigits(int base, int expo) {
		int res = 1;
		
//		for(int i = 1; i<=expo ; i++) {
//			res = res * base;
//		}
		while(expo > 0) {
			res = res * base;
			expo --;
		}
		return res;
	}
    public static void main(String [] args) {
    	System.out.println(powerDigits(5,2));
    }

}
