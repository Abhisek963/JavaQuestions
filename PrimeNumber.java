package numberprogram;

public class PrimeNumber {
	public static boolean primeNumber(int num) {
		if (num <= 1) {
            return false;
        }
		for(int i = 2; i * i<=num;i++ ) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args) {
		System.out.println(primeNumber(3));
	}

}
